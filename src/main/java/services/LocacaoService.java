package services;

import dao.LocacaoDAO;
import entity.Locacao;
import entity.Usuario;
import entity.Veiculo;
import exceptions.LocacaoException;
import exceptions.VeiculoSemEstoqueException;
import utils.DataUtils;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import static utils.DataUtils.adicionarDias;

public class LocacaoService {

    private LocacaoDAO dao;

    public Locacao alugarVeiculo(Usuario usuario, List<Veiculo> veiculos) throws VeiculoSemEstoqueException, LocacaoException {

        if (usuario == null){
            throw new LocacaoException("Nome da Pessoa Vazio");
        }

        if (veiculos == null || veiculos.isEmpty()){
            throw new LocacaoException("Modelo de veículo vazio");
        }

        for (Veiculo veiculo: veiculos){
            if(veiculo.getEstoque()==0){
                throw new VeiculoSemEstoqueException();
            }
        }

        Locacao locacao = new Locacao();
        locacao.setVeiculos(veiculos);
        locacao.setUsuario(usuario);
        locacao.setDataLocacao(new Date());

        Double valorTotal = 0d;
        for (int i = 0; i < veiculos.size(); i++){
            Veiculo veiculo = veiculos.get(i);
            Double valorVeiculo = veiculo.getPrecoLocacao();
            switch (i){
                case 1:
                    valorVeiculo = valorVeiculo * 0.75;
                    break;
                case 2:
                    valorVeiculo = valorVeiculo * 0.5;
                    break;
                case 3:
                    valorVeiculo = valorVeiculo * 0.25;
                    break;
                case 4:
                    valorVeiculo = valorVeiculo * 0;
                    break;
            }
            valorTotal += valorVeiculo;
        }

        locacao.setValor(valorTotal);

        Date dataEntrega = new Date();
        dataEntrega = adicionarDias(dataEntrega,1);

        if (DataUtils.verificarDiaSemana(dataEntrega, Calendar.SUNDAY)){
            dataEntrega = adicionarDias(dataEntrega,1);
        }

        locacao.setDataRetorno(dataEntrega);

        dao.salvar(locacao);

        return locacao;
    }

    public void setLocacaoDAO(LocacaoDAO dao){
        this.dao = dao;
    }

}
