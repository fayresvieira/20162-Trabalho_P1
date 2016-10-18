
import android.app.Activity;
import android.os.Bundle;

public class infocurso extends DebugActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inforcurso);

        Bundle args = getIntent().getExtras();
        String nome= args.getString("nome");

    }

}

