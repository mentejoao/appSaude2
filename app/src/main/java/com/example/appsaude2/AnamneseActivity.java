package com.example.appsaude2;

import android.content.Intent;
import android.os.Bundle;
import android.preference.CheckBoxPreference;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class AnamneseActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anamnese);

        // Inicialização dos campos
        EditText editTextEmail = findViewById(R.id.editText_email);
        EditText editTextDataAplicacao = findViewById(R.id.editText_data_aplicacao);
        EditText editTextHoraAplicacao = findViewById(R.id.editText_hora_aplicacao);
        EditText editTextNomeAvaliador = findViewById(R.id.editText_nome_avaliador);
        CheckBox checkBoxEstagiario = findViewById(R.id.checkbox_estagiario);
        CheckBox checkBoxProfissional = findViewById(R.id.checkbox_profissional);
        EditText editTextNomePaciente = findViewById(R.id.editText_nome_paciente);
        EditText editTextDataNascimentoPaciente = findViewById(R.id.editText_data_nascimento_paciente);
        EditText editTextIdadePaciente = findViewById(R.id.editText_idade_paciente);
        CheckBox checkboxFemininoPaciente = findViewById(R.id.checkbox_feminino_paciente);
        CheckBox checkboxMasculinoPaciente = findViewById(R.id.checkbox_masculino_paciente);
        CheckBox checkboxOutroPaciente = findViewById(R.id.checkbox_outro_paciente);
        EditText editTextPesoPaciente = findViewById(R.id.editText_peso_paciente);
        EditText editTextAlturaPaciente = findViewById(R.id.editText_altura_paciente);
        EditText editTextEnderecoPaciente = findViewById(R.id.editText_endereco_paciente);
        EditText editTextCidadePaciente = findViewById(R.id.editText_cidade_paciente);
        EditText editTextTelefonePaciente = findViewById(R.id.editText_telefone_paciente);
        EditText editTextEmailPaciente = findViewById(R.id.editText_email_paciente);
        EditText teditTextCpfPaciente = findViewById(R.id.editText_cpf_paciente);
        EditText editTextProfissaoPaciente = findViewById(R.id.editText_profissao_paciente);
        CheckBox checkboxEducacaoInfantilIncompletoPaciente = findViewById(R.id.checkbox_educacao_infantil_incompleto_paciente);
        CheckBox checkboxEducacaoInfantilCompletoPaciente = findViewById(R.id.checkbox_educacao_infantil_completo_paciente);
        CheckBox checkboxFundamentalIncompletoPaciente = findViewById(R.id.checkbox_fundamental_incompleto_paciente);
        CheckBox checkboxFundamentalCompletoPaciente = findViewById(R.id.checkbox_fundamental_completo_paciente);
        CheckBox checkboxMedioIncompletoPaciente = findViewById(R.id.checkbox_medio_incompleto_paciente);
        CheckBox checkboxMedioCompletoPaciente = findViewById(R.id.checkbox_medio_completo_paciente);
        CheckBox xcheckboxSuperiorIncompletoPaciente = findViewById(R.id.checkbox_superior_incompleto_paciente);
        CheckBox checkboxSuperiorCompletoPaciente = findViewById(R.id.checkbox_superior_completo_paciente);
        CheckBox checkboxPosGraduacaoPaciente = findViewById(R.id.checkbox_pos_graduacao_paciente);
        CheckBox checkboxMestradoPaciente = findViewById(R.id.checkbox_mestrado_paciente);
        CheckBox checkboxDoutoradoPaciente = findViewById(R.id.checkbox_doutorado_paciente);
        // Tipo sanguíneo
        CheckBox antecedentes_checkbox_a_positivo = findViewById(R.id.checkbox_tipo_a_positivo);
        CheckBox antecedentes_checkbox_a_negativo = findViewById(R.id.checkbox_tipo_a_negativo);
        CheckBox antecedentes_checkbox_b_positivo = findViewById(R.id.checkbox_tipo_b_positivo);
        CheckBox antecedentes_checkbox_b_negativo = findViewById(R.id.checkbox_tipo_b_negativo);
        CheckBox antecedentes_checkbox_ab_positivo = findViewById(R.id.checkbox_tipo_ab_positivo);
        CheckBox antecedentes_checkbox_ab_negativo = findViewById(R.id.checkbox_tipo_ab_negativo);
        CheckBox antecedentes_checkbox_o_positivo = findViewById(R.id.checkbox_tipo_o_positivo);
        CheckBox antecedentes_checkbox_o_negativo = findViewById(R.id.checkbox_tipo_o_negativo);

// Alergias
        EditText antecedentes_input_text_alergias = findViewById(R.id.editText_alergias_antecedentes);

// Consome tabaco
        CheckBox antecedentes_checkbox_sim_tabaco = findViewById(R.id.checkbox_sim_tabaco);
        CheckBox antecedentes_checkbox_nao_tabaco = findViewById(R.id.checkbox_nao_tabaco);
        CheckBox antecedentes_checkbox_nunca_fumei = findViewById(R.id.checkbox_nunca_fumei_tabaco);

// Quantidade tabaco
        EditText antecedentes_input_text_quantidade_tabaco = findViewById(R.id.editText_quantidade_tabaco_antecedentes);

// Consome bebidas alcoólicas
        CheckBox antecedentes_checkbox_sim_bebidas = findViewById(R.id.checkbox_sim_bebidas);
        CheckBox antecedentes_checkbox_nao_bebidas = findViewById(R.id.checkbox_nao_bebidas);

// Frequência de ingestão de bebidas alcoólicas
        CheckBox antecedentes_checkbox_nunca_bebidas = findViewById(R.id.checkbox_nunca_bebidas);
        CheckBox antecedentes_checkbox_mensalmente_bebidas = findViewById(R.id.checkbox_mensalmente_bebidas);
        CheckBox antecedentes_checkbox_2_4_vezes_bebidas = findViewById(R.id.checkbox_2_4_vezes_bebidas);
        CheckBox antecedentes_checkbox_2_3_vezes_bebidas = findViewById(R.id.checkbox_2_3_vezes_bebidas);
        CheckBox antecedentes_checkbox_4_mais_vezes_bebidas = findViewById(R.id.checkbox_4_mais_vezes_bebidas);

// Uso de outras substâncias psicoativas
        CheckBox antecedentes_checkbox_nao_substancias = findViewById(R.id.checkbox_nao_substancias);
        CheckBox antecedentes_checkbox_sim_estimulantes = findViewById(R.id.checkbox_sim_estimulantes);
        CheckBox antecedentes_checkbox_sim_perturbadoras = findViewById(R.id.checkbox_sim_perturbadoras);
        CheckBox antecedentes_checkbox_sim_depressoras = findViewById(R.id.checkbox_sim_depressoras);

// Alimentação
        CheckBox antecedentes_checkbox_cafe_da_manha = findViewById(R.id.checkbox_cafe_da_manha);
        CheckBox antecedentes_checkbox_lanche_da_manha = findViewById(R.id.checkbox_lanche_da_manha);
        CheckBox antecedentes_checkbox_almoco = findViewById(R.id.checkbox_almoco);
        CheckBox antecedentes_checkbox_lanche_da_tarde = findViewById(R.id.checkbox_lanche_da_tarde);
        CheckBox antecedentes_checkbox_jantar = findViewById(R.id.checkbox_jantar);
        CheckBox antecedentes_checkbox_ceia = findViewById(R.id.checkbox_ceia);

// Porções de frutas
        CheckBox antecedentes_checkbox_1_porcao_fruta = findViewById(R.id.checkbox_1_porcao_fruta);
        CheckBox antecedentes_checkbox_2_porcoes_fruta = findViewById(R.id.checkbox_2_porcoes_fruta);
        CheckBox antecedentes_checkbox_3_porcoes_fruta = findViewById(R.id.checkbox_3_porcoes_fruta);
        CheckBox  antecedentes_checkbox_4_porcoes_fruta = findViewById(R.id.checkbox_4_porcoes_fruta);
        CheckBox antecedentes_checkbox_5_porcoes_fruta = findViewById(R.id.checkbox_5_porcoes_fruta);
        CheckBox antecedentes_checkbox_6_ou_mais_porcoes_fruta = findViewById(R.id.checkbox_6_ou_mais_porcoes_fruta);

// Porções de verduras
        CheckBox antecedentes_checkbox_1_porcao_verdura = findViewById(R.id.checkbox_1_porcao_verdura);
        CheckBox antecedentes_checkbox_2_porcoes_verdura = findViewById(R.id.checkbox_2_porcoes_verdura);
        CheckBox antecedentes_checkbox_3_porcoes_verdura = findViewById(R.id.checkbox_3_porcoes_verdura);
        CheckBox antecedentes_checkbox_4_porcoes_verdura = findViewById(R.id.checkbox_4_porcoes_verdura);
        CheckBox antecedentes_checkbox_5_porcoes_verdura = findViewById(R.id.checkbox_5_porcoes_verdura);
        CheckBox antecedentes_checkbox_6_ou_mais_porcoes_verdura = findViewById(R.id.checkbox_6_ou_mais_porcoes_verdura);

        // Consumo de água
        CheckBox antecedentes_checkbox_sim_agua = findViewById(R.id.checkbox_sim_agua);
        CheckBox antecedentes_checkbox_nao_agua = findViewById(R.id.checkbox_nao_agua);

        // Horas de Sono

        CheckBox checkboxMenosDeQuatroHoras = findViewById(R.id.checkbox_menos_de_quatro_horas);
        CheckBox checkboxEntreQuatroESexoHoras = findViewById(R.id.checkbox_entre_quatro_e_seis_horas);
        CheckBox checkboxEntreSeisEOitoHoras = findViewById(R.id.checkbox_entre_seis_e_oito_horas);
        CheckBox checkboxMaisDeOitoHoras = findViewById(R.id.checkbox_mais_de_oito_horas);

// Fatores que interferem no sono

        EditText editTextFatoresSono = findViewById(R.id.editText_fatores_sono);

// Prática de atividades físicas

        CheckBox checkboxNuncaPraticaAtividade = findViewById(R.id.checkbox_nunca_pratica_atividade);
        CheckBox checkboxRaramentePraticaAtividade = findViewById(R.id.checkbox_raramente_pratica_atividade);
        CheckBox checkboxOcasionalmentePraticaAtividade = findViewById(R.id.checkbox_ocasionamente_pratica_atividade);
        CheckBox checkboxFrequentementePraticaAtividade = findViewById(R.id.checkbox_frequentemente_pratica_atividade);
        CheckBox checkboxMuitoFrequentementePraticaAtividade = findViewById(R.id.checkbox_muito_frequentemente_pratica_atividade);


        EditText editTextOcorrenciaLLcaPaciente = findViewById(R.id.editText_ocorrencia_llca_paciente);
        EditText editTextProblemasSaudePaciente = findViewById(R.id.editText_problemas_saude_paciente);


        CheckBox checkBoxOcorrenciaDireito = findViewById(R.id.checkbox_ocorrencia_llca_direito);
        CheckBox checkBoxOcorrenciaEsquerdo = findViewById(R.id.checkbox_ocorrencia_llca_esquerdo);
        CheckBox checkBoxOcorrenciaBilateral = findViewById(R.id.checkbox_ocorrencia_llca_bilateral);


        CheckBox checkboxOcorrenciaAgudaLLCA = findViewById(R.id.checkbox_ocorrencia_tempo_llca_aguda);
        CheckBox checkboxOcorrenciaSubagudaLLCA = findViewById(R.id.checkbox_ocorrencia_tempo_llca_subaguda);
        CheckBox checkboxOcorrenciaCronicaLLCA = findViewById(R.id.checkbox_ocorrencia_tempo_llca_cronica);

        CheckBox checkboxGrauILLCA = findViewById(R.id.checkbox_grau_llca_I);
        CheckBox checkboxGrauIILLCA = findViewById(R.id.checkbox_grau_llca_II);
        CheckBox checkboxGrauIIILLCA = findViewById(R.id.checkbox_grau_llca_III);

        EditText editTextSintomasAtuais = findViewById(R.id.editText_sintomas_sinais_atuais);

        EditText editTextAlivioSinatomas = findViewById(R.id.editText_acoes_alivio_dor);

        EditText editTextPioraDor = findViewById(R.id.editText_piorar_dor_joelho);

        EditText editTextPosturaCorporal = findViewById(R.id.editText_postura_corporal);

        CheckBox checkBoxClinicoMedico = findViewById(R.id.checkbox_tratamento_llca_clinico_medico);
        CheckBox checkBoxCirurgico = findViewById(R.id.checkbox_tratamento_llca_cirurgico);
        CheckBox checkBoxAcupuntura = findViewById(R.id.checkbox_tratamento_llca_acupuntura);
        CheckBox checkBoxMassoterapia = findViewById(R.id.checkbox_tratamento_llca_massoterapia);
        CheckBox checkBoxMedicamentoso = findViewById(R.id.checkbox_tratamento_llca_medicamentoso);
        CheckBox checkBoxFisioterapia = findViewById(R.id.checkbox_tratamento_llca_fisioterapia);
        CheckBox checkBoxOutro = findViewById(R.id.checkbox_tratamento_llca_outro);

        EditText editTextTecnicaReconstrucao = findViewById(R.id.editText_tecnica_reconstrucao);


        // Lógica de exclusividade entre os checkboxes
        checkBoxEstagiario.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                checkBoxProfissional.setChecked(false);
            }
        });

        checkBoxProfissional.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                checkBoxEstagiario.setChecked(false);
            }
        });

        Button buttonSalvar = findViewById(R.id.button_salvar);
        buttonSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Validação dos campos obrigatórios
                if (editTextEmail.getText().toString().isEmpty() ||
                        editTextDataAplicacao.getText().toString().isEmpty() ||
                        editTextNomeAvaliador.getText().toString().isEmpty()) {
                    Toast.makeText(AnamneseActivity.this, "Por favor, preencha todos os campos obrigatórios.", Toast.LENGTH_SHORT).show();
                } else {
                    // Persistir os dados (aqui você pode salvar em uma estrutura de dados, por exemplo)
                    // Para este exemplo, vou apenas usar um Toast
                    Toast.makeText(AnamneseActivity.this, "Dados salvos com sucesso!", Toast.LENGTH_SHORT).show();

                    // Voltar para MainActivity
                    Intent intent = new Intent(AnamneseActivity.this, MainActivity.class);
                    startActivity(intent);
                }
            }
        });
    }
}