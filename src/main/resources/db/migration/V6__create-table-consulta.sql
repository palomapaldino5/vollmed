-- Com base nas ecpilicações de modelagem
-- Considerando  a cardinalidade e o modelo conceitual
-- Execute uma migaration para a consulta

-- Considere o id do paciente
-- Considere o id da médico
-- Considere o id da consulta

create table consulta(

    int bigint not null auto_increment,
    medico_id bigint not null,
    paciente_id bigint not null,
    dataConsulta datetime not null,
    primary key(id),
    foreign key(medico_id) references medico(id),
    foreign key(paciente_id) references paciente(id)