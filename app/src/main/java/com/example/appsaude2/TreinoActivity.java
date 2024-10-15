package com.example.appsaude2;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

public class TreinoActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_treino); // Certifique-se de que este arquivo XML contém todos os TextViews necessários

        // Links do YouTube para cada seção
        // TRATAMENTO CIRÚRGICO EM CASA
        final String[] urlsPreOperatorioCasa = {
                "https://www.youtube.com/shorts/N6kXYg0Hgwg",
                "https://www.youtube.com/shorts/0nxlz6Hdm78"
        };

        final String[] urlsPosOperatorioCasa = {
                "https://www.youtube.com/shorts/kUMHFTWUrWU",
                "https://www.youtube.com/shorts/Nfes7tDCXN8"
        };

        // TRATAMENTO CIRÚRGICO NA ACADEMIA
        final String[] urlsPreOperatorioAcademia = {
                "https://www.youtube.com/shorts/hoF0Ac39b-c",
                "https://www.youtube.com/shorts/kU0ZPAYPzN0"
        };

        final String[] urlsPosOperatorioAcademia = {
                "https://www.youtube.com/shorts/yQyRoP6EMmQ",
                "https://www.youtube.com/shorts/3AEZxjjTNhA"
        };

        // TRATAMENTO CONSERVADOR EM CASA
        final String[] urlsSubagudaCasa = {
                "https://www.youtube.com/shorts/I4nX__UgkLs",
                "https://www.youtube.com/shorts/I7IRSOAFb_0"
        };

        final String[] urlsCronicaCasa = {
                "https://www.youtube.com/shorts/kOEx-3zdX1s",
                "https://www.youtube.com/shorts/Z5yMuT-KfkI"
        };

        // TRATAMENTO CONSERVADOR NA ACADEMIA
        final String[] urlsAgudaAcademia = {
                "https://www.youtube.com/shorts/sRHclwAi8mw",
                "https://www.youtube.com/shorts/KxThFetnxAs"
        };

        final String[] urlsCronicaAcademia = {
                "https://www.youtube.com/shorts/r_ZileYE-lg",
                "https://www.youtube.com/shorts/YpDEGW7oq0M"
        };

        // Adiciona os listeners de clique para cada categoria
        // TRATAMENTO CIRÚRGICO EM CASA - Pré Operatório
        findViewById(R.id.textViewCirurgicoCasaPreLink1).setOnClickListener(v -> openLink(urlsPreOperatorioCasa[0]));
        findViewById(R.id.textViewCirurgicoCasaPreLink2).setOnClickListener(v -> openLink(urlsPreOperatorioCasa[1]));

        // TRATAMENTO CIRÚRGICO EM CASA - Pós Cirúrgico
        findViewById(R.id.textViewCirurgicoCasaPosLink1).setOnClickListener(v -> openLink(urlsPosOperatorioCasa[0]));
        findViewById(R.id.textViewCirurgicoCasaPosLink2).setOnClickListener(v -> openLink(urlsPosOperatorioCasa[1]));

        // TRATAMENTO CIRÚRGICO NA ACADEMIA - Pré Operatório
        findViewById(R.id.textViewCirurgicoAcademiaPreLink1).setOnClickListener(v -> openLink(urlsPreOperatorioAcademia[0]));
        findViewById(R.id.textViewCirurgicoAcademiaPreLink2).setOnClickListener(v -> openLink(urlsPreOperatorioAcademia[1]));

        // TRATAMENTO CIRÚRGICO NA ACADEMIA - Pré Operatorio
        findViewById(R.id.textViewConservadorCasaPreLink1).setOnClickListener(v -> openLink(urlsPosOperatorioAcademia[0]));
        findViewById(R.id.textViewConservadorCasaPreLink2).setOnClickListener(v -> openLink(urlsPosOperatorioAcademia[1]));

        // TRATAMENTO CONSERVADOR EM CASA - Pós Cirúrgico
        findViewById(R.id.textViewConservadorCasaPosLink1).setOnClickListener(v -> openLink(urlsSubagudaCasa[0]));
        findViewById(R.id.textViewConservadorCasaPosLink2).setOnClickListener(v -> openLink(urlsSubagudaCasa[1]));

        // TRATAMENTO CONSERVADOR EM CASA - Fase crônica
        findViewById(R.id.textViewConservadorCasaFaseCronicaLink1).setOnClickListener(v -> openLink(urlsCronicaCasa[0]));
        findViewById(R.id.textViewConservadorCasaFaseCronicaLink2).setOnClickListener(v -> openLink(urlsCronicaCasa[1]));

        // TRATAMENTO CONSERVADOR NA ACADEMIA - Fase aguda
        findViewById(R.id.textViewConservadorAcademiaFaseAgudaLink1).setOnClickListener(v -> openLink(urlsAgudaAcademia[0]));
        findViewById(R.id.textViewConservadorAcademiaFaseAgudaLink2).setOnClickListener(v -> openLink(urlsAgudaAcademia[1]));

        // TRATAMENTO CONSERVADOR NA ACADEMIA - Fase crônica
        findViewById(R.id.textViewConservadorAcademiaFaseCronicaLink1).setOnClickListener(v -> openLink(urlsCronicaAcademia[0]));
        findViewById(R.id.textViewConservadorAcademiaFaseCronicaLink2).setOnClickListener(v -> openLink(urlsCronicaAcademia[1]));
    }

    private void openLink(String url) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }
}
