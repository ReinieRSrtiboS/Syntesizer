package com.syntesizer.reinier2.syntesizer;

        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.MotionEvent;
        import android.view.View;
        import android.widget.Button;
        import java.util.ArrayList;
        import java.util.List;

public class pianoActivity extends AppCompatActivity {

    Connection conn;
    int tone; //start with C, C=0 C#=1 D=2....
    List<Integer> pakket = new ArrayList<Integer>(); //id, tone, on, packageid
    int on = 0; //0 is off, 1 is on

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        int instrument = getIntent().getIntExtra("instrument", 0);
        conn = new Connection(instrument);  //start de connectie
        pakket.add(0, conn.getID());    //vraagt id op
        //onzin data
        pakket.add(1, tone);
        pakket.add(2, on);
        pakket.add(3, 0);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_piano);

        /*
        reageert op de toetsen. als er een toets wordt indegrukt of losgelaten stuurt hij dit door naar de server.
         */
        Button cKey = (Button) findViewById(R.id.Ckey);
        cKey.setOnTouchListener(new View.OnTouchListener() {

            @Override
            public boolean onTouch(View view, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN ) {
                    System.out.println("C start");
                    tone = 0;
                    on = 1;
                    pakket.set(1, tone);
                    pakket.set(2, on);
                    conn.send(pakket);
                } else if (event.getAction() == MotionEvent.ACTION_UP ) {
                    System.out.println("C stop");
                    tone = 0;
                    on = 0;
                    pakket.set(1, tone);
                    pakket.set(2, on);
                    conn.send(pakket);
                }
                return true;
            }
        });

        Button dKey = (Button) findViewById(R.id.Dkey);
        dKey.setOnTouchListener(new View.OnTouchListener() {

            @Override
            public boolean onTouch(View view, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN ) {
                    System.out.println("D start");
                    tone = 2;
                    on = 1;
                    pakket.set(1, tone);
                    pakket.set(2, on);
                    conn.send(pakket);
                } else if (event.getAction() == MotionEvent.ACTION_UP ) {
                    System.out.println("D stop");
                    tone = 2;
                    on = 0;
                    pakket.set(1, tone);
                    pakket.set(2, on);
                    conn.send(pakket);
                }
                return true;
            }
        });

        Button eKey = (Button) findViewById(R.id.Ekey);
        eKey.setOnTouchListener(new View.OnTouchListener() {

            @Override
            public boolean onTouch(View view, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN ) {
                    System.out.println("E start");
                    tone = 4;
                    on = 1;
                    pakket.set(1, tone);
                    pakket.set(2, on);
                    conn.send(pakket);
                } else if (event.getAction() == MotionEvent.ACTION_UP ) {
                    System.out.println("E stop");
                    tone = 4;
                    on = 0;
                    pakket.set(1, tone);
                    pakket.set(2, on);
                    conn.send(pakket);
                }
                return true;
            }
        });

        Button fKey = (Button) findViewById(R.id.Fkey);
        fKey.setOnTouchListener(new View.OnTouchListener() {

            @Override
            public boolean onTouch(View view, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN ) {
                    System.out.println("F start");
                    tone = 5;
                    on = 1;
                    pakket.set(1, tone);
                    pakket.set(2, on);
                    conn.send(pakket);
                } else if (event.getAction() == MotionEvent.ACTION_UP ) {
                    System.out.println("F stop");
                    tone = 5;
                    on = 0;
                    pakket.set(1, tone);
                    pakket.set(2, on);
                    conn.send(pakket);
                }
                return true;
            }
        });

        Button gKey = (Button) findViewById(R.id.Gkey);
        gKey.setOnTouchListener(new View.OnTouchListener() {

            @Override
            public boolean onTouch(View view, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN ) {
                    System.out.println("G start");
                    tone = 7;
                    on = 1;
                    pakket.set(1, tone);
                    pakket.set(2, on);
                    conn.send(pakket);
                } else if (event.getAction() == MotionEvent.ACTION_UP ) {
                    System.out.println("G stop");
                    tone = 7;
                    on = 0;
                    pakket.set(1, tone);
                    pakket.set(2, on);
                    conn.send(pakket);
                }
                return true;
            }
        });

        Button aKey = (Button) findViewById(R.id.Akey);
        aKey.setOnTouchListener(new View.OnTouchListener() {

            @Override
            public boolean onTouch(View view, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN ) {
                    System.out.println("A start");
                    tone = 9;
                    on = 1;
                    pakket.set(1, tone);
                    pakket.set(2, on);
                    conn.send(pakket);
                } else if (event.getAction() == MotionEvent.ACTION_UP ) {
                    System.out.println("A stop");
                    tone = 9;
                    on = 0;
                    pakket.set(1, tone);
                    pakket.set(2, on);
                    conn.send(pakket);
                }
                return true;
            }
        });

        Button bKey = (Button) findViewById(R.id.Bkey);
        bKey.setOnTouchListener(new View.OnTouchListener() {

            @Override
            public boolean onTouch(View view, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN ) {
                    System.out.println("B start");
                    tone = 11;
                    on = 1;
                    pakket.set(1, tone);
                    pakket.set(2, on);
                    conn.send(pakket);
                } else if (event.getAction() == MotionEvent.ACTION_UP ) {
                    System.out.println("B stop");
                    tone = 11;
                    on = 0;
                    pakket.set(1, tone);
                    pakket.set(2, on);
                    conn.send(pakket);
                }
                return true;
            }
        });

        Button CKey = (Button) findViewById(R.id.CSharp);
        CKey.setOnTouchListener(new View.OnTouchListener() {

            @Override
            public boolean onTouch(View view, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN ) {
                    System.out.println("C# start");
                    tone = 1;
                    on = 1;
                    pakket.set(1, tone);
                    pakket.set(2, on);
                    conn.send(pakket);
                } else if (event.getAction() == MotionEvent.ACTION_UP ) {
                    System.out.println("C# stop");
                    tone = 1;
                    on = 0;
                    pakket.set(1, tone);
                    pakket.set(2, on);
                    conn.send(pakket);
                }
                return true;
            }
        });

        Button DKey = (Button) findViewById(R.id.DSharp);
        DKey.setOnTouchListener(new View.OnTouchListener() {

            @Override
            public boolean onTouch(View view, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN ) {
                    System.out.println("D# start");
                    tone = 3;
                    on = 1;
                    pakket.set(1, tone);
                    pakket.set(2, on);
                    conn.send(pakket);
                } else if (event.getAction() == MotionEvent.ACTION_UP ) {
                    System.out.println("D# stop");
                    tone = 3;
                    on = 0;
                    pakket.set(1, tone);
                    pakket.set(2, on);
                    conn.send(pakket);
                }
                return true;
            }
        });

        Button FKey = (Button) findViewById(R.id.FSharp);
        FKey.setOnTouchListener(new View.OnTouchListener() {

            @Override
            public boolean onTouch(View view, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN ) {
                    System.out.println("F# start");
                    tone = 6;
                    on = 1;
                    pakket.set(1, tone);
                    pakket.set(2, on);
                    conn.send(pakket);
                } else if (event.getAction() == MotionEvent.ACTION_UP ) {
                    System.out.println("F# stop");
                    tone = 6;
                    on = 0;
                    pakket.set(1, tone);
                    pakket.set(2, on);
                    conn.send(pakket);
                }
                return true;
            }
        });

        Button GKey = (Button) findViewById(R.id.GSharp);
        GKey.setOnTouchListener(new View.OnTouchListener() {

            @Override
            public boolean onTouch(View view, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN ) {
                    System.out.println("G# start");
                    tone = 8;
                    on = 1;
                    pakket.set(1, tone);
                    pakket.set(2, on);
                    conn.send(pakket);
                } else if (event.getAction() == MotionEvent.ACTION_UP ) {
                    System.out.println("G# stop");
                    tone = 8;
                    on = 0;
                    pakket.set(1, tone);
                    pakket.set(2, on);
                    conn.send(pakket);
                }
                return true;
            }
        });

        Button AKey = (Button) findViewById(R.id.ASharp);
        AKey.setOnTouchListener(new View.OnTouchListener() {

            @Override
            public boolean onTouch(View view, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN ) {
                    System.out.println("A# start");
                    tone = 10;
                    on = 1;
                    pakket.set(1, tone);
                    pakket.set(2, on);
                    conn.send(pakket);
                } else if (event.getAction() == MotionEvent.ACTION_UP ) {
                    System.out.println("A# stop");
                    tone = 10;
                    on = 0;
                    pakket.set(1, tone);
                    pakket.set(2, on);
                    conn.send(pakket);
                }
                return true;
            }
        });
    }

    //sluit connectie wanneer de app wordt afgesloten
    @Override
    protected void onStop() {
        conn.Close();
    }
}
