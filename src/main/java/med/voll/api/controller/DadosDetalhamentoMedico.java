package med.voll.api.controller;

import med.voll.api.endereco.Endereco;
import med.voll.api.medico.Especialidade;
import med.voll.api.medico.Medico;

public record DadosDetalhamentoMedico(
        Long id,
        String nome,
        String email,
        String crm,
        String telefone,
        Especialidade especialidade,
        Endereco endereco
) {
    // Construtor auxiliar para facilitar conversão de Medico -> DTO
    /**
 * @param medico
 */
public DadosDetalhamentoMedico(Medico medico) {
        this(medico.getId(),medico.getNome(),medico.getEmail(),medico.getCrm(),medico.getTelefone(),medico.getEspecialidade(),medico.getEndereco());
    }
}
