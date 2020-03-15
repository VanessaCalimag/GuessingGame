package au.edu.jcu.cp3406.guessinggame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    EditText numberInput;

    public void checkGuess(View view) {
        Game game = new Game();
        numberInput = findViewById(R.id.editText);
        int numberGuessed = Integer.parseInt(numberInput.getText().toString());

        boolean correctGuess = false;
        String correctString = new String("Correct! You guessed " + game.number);
        String incorrectString = new String("Try again, the correct answer is " + game.number);

        correctGuess = game.check(numberGuessed);
        if (correctGuess) {
            Toast.makeText(getApplicationContext(), correctString, Toast.LENGTH_SHORT).show();
        }
        else {
            Toast.makeText(getApplicationContext(), incorrectString, Toast.LENGTH_LONG).show();
        }
    }
}