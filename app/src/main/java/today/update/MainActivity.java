package today.update;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class MainActivity extends Activity implements View.OnClickListener {

    private View i1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button Left, Right, Up, Down;

        ImageView i1;

        Left = (Button) findViewById(R.id.button2);
        Right = (Button) findViewById(R.id.button3);
        Up = (Button) findViewById(R.id.button4);
        Down = (Button) findViewById(R.id.button6);

        i1 = (ImageView) findViewById(R.id.imageView);


        Left.setOnClickListener(this);
        Right.setOnClickListener(this);
        Up.setOnClickListener(this);
        Down.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.button2:
                
            {
                Toast.makeText(getApplication(), "Left", Toast.LENGTH_SHORT).show();
                RelativeLayout.LayoutParams mParams = (RelativeLayout.LayoutParams)
                        i1.getLayoutParams();
                mParams.leftMargin -= 20;
                i1.setLayoutParams(mParams);
                break;
            }


            case R.id.button3: {
                Toast.makeText(getApplication(), "Right", Toast.LENGTH_SHORT).show();


                RelativeLayout.LayoutParams mParams = (RelativeLayout.LayoutParams)
                        i1.getLayoutParams();
                mParams.topMargin += 20;
                i1.setLayoutParams(mParams);
                break;
            }


            case R.id.button4: {
                Toast.makeText(getApplication(), "Up", Toast.LENGTH_SHORT).show();
                RelativeLayout.LayoutParams mParams = (RelativeLayout.LayoutParams)
                        i1.getLayoutParams();
                mParams.topMargin -= 20;
                i1.setLayoutParams(mParams);
                break;
            }

            case R.id.button6: {
                Toast.makeText(getApplication(), "Down", Toast.LENGTH_SHORT).show();

                RelativeLayout.LayoutParams mParams = (RelativeLayout.LayoutParams)
                        i1.getLayoutParams();
                mParams.topMargin += 20;
                i1.setLayoutParams(mParams);
                break;
            }


        }
    }
}