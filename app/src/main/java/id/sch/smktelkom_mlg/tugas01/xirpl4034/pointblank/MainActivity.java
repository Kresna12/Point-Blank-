package id.sch.smktelkom_mlg.tugas01.xirpl4034.pointblank;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etNama;
    RadioButton T, CT;
    Button sbm;
    TextView nm, pk, ps, lp, hsl;
    Spinner sL;
    CheckBox snip, pis, ass;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNama = (EditText) findViewById(R.id.etNama);
        T = (RadioButton) findViewById(R.id.T);
        CT = (RadioButton) findViewById(R.id.CT);
        sbm = (Button) findViewById(R.id.sbm);
        hsl = (TextView) findViewById(R.id.hsl);
        nm = (TextView) findViewById(R.id.nm);
        pk = (TextView) findViewById(R.id.pk);
        ps = (TextView) findViewById(R.id.ps);
        lp = (TextView) findViewById(R.id.lp);
        sL = (Spinner) findViewById(R.id.lokasi);
        snip = (CheckBox) findViewById(R.id.snip);
        pis = (CheckBox) findViewById(R.id.pis);
        ass = (CheckBox) findViewById(R.id.ass);


        sbm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View V) {

                doProcess();
                doClick();

            }
        });
    }

    private void doClick() {
        String view2 = null;
        if (T.isChecked()) {
            view2 = T.getText().toString();
        } else if (CT.isChecked()) {
            view2 = CT.getText().toString();
        }
        if (view2 == null) {

            hsl.setText("You must choose your troops");
        } else {
            hsl.setText("Your Troops : " + view2);
        }
    }

    private void doProcess() {
        if (isValid()) {
            String name = etNama.getText().toString();
        }

    }

    private boolean isValid() {
        boolean valid = true;
        String name = etNama.getText().toString();

        if (name.isEmpty()) {
            etNama.setError("You Must Insert Your Name");
            valid = false;
        } else {
            etNama.setError(null);
        }

        return valid;
    }
}