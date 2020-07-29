package appbus.com.example.breno.appbus;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);
    }


    //
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item) {

        // Handle item selection
        switch (item.getItemId()) {

            case R.id.home:
                home();
                return true;
            case R.id.saldo:
                saldo();
                return true;
            case R.id.pagamento:
                pagamento();
                return true;
            case R.id.historico:
                historico();
                return true;
            case R.id.sobre:
                sobre();
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    private void historico() {
        setContentView(R.layout.historico);
    }

    private void pagamento()
    {
        setContentView(R.layout.pagamento);
    }

    private void saldo()
    {
        setContentView(R.layout.saldo);
    }
    private void sobre() {
        setContentView(R.layout.sobre);
    }
    private void home() {
        setContentView(R.layout.home);
    }

}
