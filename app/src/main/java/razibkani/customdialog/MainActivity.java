package razibkani.customdialog;

import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private Button dialogButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dialogButton = (Button) findViewById(R.id.btn_dialog);

        dialogButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDialog();
            }
        });
    }

    private void showDialog() {
        final Dialog dialog = new Dialog(MainActivity.this);
        //menghilangkan title
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        //set layout
        dialog.setContentView(R.layout.layout_dialog);
        //menjadikan background (di luar layout)  menjadi transparan
        dialog.getWindow().setBackgroundDrawable(
                new ColorDrawable(android.graphics.Color.TRANSPARENT));
        //menampilkan dialog
        dialog.show();

        ImageView buttonClose = (ImageView) dialog.findViewById(R.id.dialog_close);
        buttonClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //menghilangkan dialog
                dialog.dismiss();
            }
        });
    }
}
