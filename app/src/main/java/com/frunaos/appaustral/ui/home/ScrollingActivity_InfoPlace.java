package com.frunaos.appaustral.ui.home;

import android.content.res.AssetManager;
import android.content.res.Resources;
import android.os.Bundle;

import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import com.frunaos.appaustral.R;

public class ScrollingActivity_InfoPlace extends AppCompatActivity {
    private TextView tv1;
    private StringBuilder text = new StringBuilder();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrolling__info_place);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        tv1 = (TextView) findViewById(R.id.tv1);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        Bundle bundle = getIntent().getExtras();
        String dato = bundle.getString("ciudad");


        CollapsingToolbarLayout toolbarLayout = (CollapsingToolbarLayout) findViewById(R.id.toolbar_layout);

        if (dato.equals("Puerto Montt")) {
            toolbarLayout.setBackgroundResource(R.drawable.pm);
            toolbarLayout.setTitle(dato);

            BufferedReader reader = null;

            try {
                reader = new BufferedReader(
                        new InputStreamReader(getAssets().open("pm")));

                // do reading, usually loop until end of file reading
                String mLine;
                while ((mLine = reader.readLine()) != null) {
                    text.append(mLine);
                    text.append('\n');
                }
            } catch (IOException e) {
                Toast.makeText(getApplicationContext(), "Error reading file!", Toast.LENGTH_LONG).show();
                e.printStackTrace();
            } finally {
                if (reader != null) {
                    try {
                        reader.close();
                    } catch (IOException e) {
                        //log the exception
                    }
                }
            }


                tv1.setText((CharSequence) text);


            }
            if (dato.equals("Pelluco")) {
                toolbarLayout.setBackgroundResource(R.drawable.pelluco);
                toolbarLayout.setTitle(dato);

                BufferedReader reader = null;

                try {
                    reader = new BufferedReader(
                            new InputStreamReader(getAssets().open("pelluco")));

                    // do reading, usually loop until end of file reading
                    String mLine;
                    while ((mLine = reader.readLine()) != null) {
                        text.append(mLine);
                        text.append('\n');
                    }
                } catch (IOException e) {
                    Toast.makeText(getApplicationContext(), "Error reading file!", Toast.LENGTH_LONG).show();
                    e.printStackTrace();
                } finally {
                    if (reader != null) {
                        try {
                            reader.close();
                        } catch (IOException e) {
                            //log the exception
                        }
                    }
                }


                tv1.setText((CharSequence) text);



            }
            if (dato.equals("Pelluhuin")) {
                toolbarLayout.setBackgroundResource(R.drawable.pelluhuin);
                toolbarLayout.setTitle(dato);

                BufferedReader reader = null;

                try {
                    reader = new BufferedReader(
                            new InputStreamReader(getAssets().open("pelluhuin")));

                    // do reading, usually loop until end of file reading
                    String mLine;
                    while ((mLine = reader.readLine()) != null) {
                        text.append(mLine);
                        text.append('\n');
                    }
                } catch (IOException e) {
                    Toast.makeText(getApplicationContext(), "Error reading file!", Toast.LENGTH_LONG).show();
                    e.printStackTrace();
                } finally {
                    if (reader != null) {
                        try {
                            reader.close();
                        } catch (IOException e) {
                            //log the exception
                        }
                    }
                }


                tv1.setText((CharSequence) text);



            }
            if (dato.equals("Coihuin")) {
                toolbarLayout.setBackgroundResource(R.drawable.coihuin);
                toolbarLayout.setTitle(dato);

                BufferedReader reader = null;

                try {
                    reader = new BufferedReader(
                            new InputStreamReader(getAssets().open("coihuin")));

                    // do reading, usually loop until end of file reading
                    String mLine;
                    while ((mLine = reader.readLine()) != null) {
                        text.append(mLine);
                        text.append('\n');
                    }
                } catch (IOException e) {
                    Toast.makeText(getApplicationContext(), "Error reading file!", Toast.LENGTH_LONG).show();
                    e.printStackTrace();
                } finally {
                    if (reader != null) {
                        try {
                            reader.close();
                        } catch (IOException e) {
                            //log the exception
                        }
                    }
                }


                tv1.setText((CharSequence) text);


            }
            if (dato.equals("Chamiza")) {
                toolbarLayout.setBackgroundResource(R.drawable.chamiza);
                toolbarLayout.setTitle(dato);

                BufferedReader reader = null;

                try {
                    reader = new BufferedReader(
                            new InputStreamReader(getAssets().open("chamiza")));

                    // do reading, usually loop until end of file reading
                    String mLine;
                    while ((mLine = reader.readLine()) != null) {
                        text.append(mLine);
                        text.append('\n');
                    }
                } catch (IOException e) {
                    Toast.makeText(getApplicationContext(), "Error reading file!", Toast.LENGTH_LONG).show();
                    e.printStackTrace();
                } finally {
                    if (reader != null) {
                        try {
                            reader.close();
                        } catch (IOException e) {
                            //log the exception
                        }
                    }
                }


                tv1.setText((CharSequence) text);


            }
            if (dato.equals("Piedra Azul")) {
                toolbarLayout.setBackgroundResource(R.drawable.piedraazul);
                toolbarLayout.setTitle(dato);

                BufferedReader reader = null;

                try {
                    reader = new BufferedReader(
                            new InputStreamReader(getAssets().open("piedraazul")));

                    // do reading, usually loop until end of file reading
                    String mLine;
                    while ((mLine = reader.readLine()) != null) {
                        text.append(mLine);
                        text.append('\n');
                    }
                } catch (IOException e) {
                    Toast.makeText(getApplicationContext(), "Error reading file!", Toast.LENGTH_LONG).show();
                    e.printStackTrace();
                } finally {
                    if (reader != null) {
                        try {
                            reader.close();
                        } catch (IOException e) {
                            //log the exception
                        }
                    }
                }


                tv1.setText((CharSequence) text);


            }
            if (dato.equals("PichiQuillaipe")) {
                toolbarLayout.setBackgroundResource(R.drawable.pichiquillaipe);
                toolbarLayout.setTitle(dato);

                BufferedReader reader = null;

                try {
                    reader = new BufferedReader(
                            new InputStreamReader(getAssets().open("pichiquillaipe")));

                    // do reading, usually loop until end of file reading
                    String mLine;
                    while ((mLine = reader.readLine()) != null) {
                        text.append(mLine);
                        text.append('\n');
                    }
                } catch (IOException e) {
                    Toast.makeText(getApplicationContext(), "Error reading file!", Toast.LENGTH_LONG).show();
                    e.printStackTrace();
                } finally {
                    if (reader != null) {
                        try {
                            reader.close();
                        } catch (IOException e) {
                            //log the exception
                        }
                    }
                }


                tv1.setText((CharSequence) text);


            }
            if (dato.equals("Quillaipe")) {
                toolbarLayout.setBackgroundResource(R.drawable.quillaipe);
                toolbarLayout.setTitle(dato);

                BufferedReader reader = null;

                try {
                    reader = new BufferedReader(
                            new InputStreamReader(getAssets().open("quillaipe")));

                    // do reading, usually loop until end of file reading
                    String mLine;
                    while ((mLine = reader.readLine()) != null) {
                        text.append(mLine);
                        text.append('\n');
                    }
                } catch (IOException e) {
                    Toast.makeText(getApplicationContext(), "Error reading file!", Toast.LENGTH_LONG).show();
                    e.printStackTrace();
                } finally {
                    if (reader != null) {
                        try {
                            reader.close();
                        } catch (IOException e) {
                            //log the exception
                        }
                    }
                }


                tv1.setText((CharSequence) text);


            }
            if (dato.equals("Metri")) {
                toolbarLayout.setBackgroundResource(R.drawable.metri);
                toolbarLayout.setTitle(dato);

                BufferedReader reader = null;

                try {
                    reader = new BufferedReader(
                            new InputStreamReader(getAssets().open("metri")));

                    // do reading, usually loop until end of file reading
                    String mLine;
                    while ((mLine = reader.readLine()) != null) {
                        text.append(mLine);
                        text.append('\n');
                    }
                } catch (IOException e) {
                    Toast.makeText(getApplicationContext(), "Error reading file!", Toast.LENGTH_LONG).show();
                    e.printStackTrace();
                } finally {
                    if (reader != null) {
                        try {
                            reader.close();
                        } catch (IOException e) {
                            //log the exception
                        }
                    }
                }


                tv1.setText((CharSequence) text);


            }
            if (dato.equals("Lenca")) {
                toolbarLayout.setBackgroundResource(R.drawable.lenca);
                toolbarLayout.setTitle(dato);

                BufferedReader reader = null;

                try {
                    reader = new BufferedReader(
                            new InputStreamReader(getAssets().open("lenca")));

                    // do reading, usually loop until end of file reading
                    String mLine;
                    while ((mLine = reader.readLine()) != null) {
                        text.append(mLine);
                        text.append('\n');
                    }
                } catch (IOException e) {
                    Toast.makeText(getApplicationContext(), "Error reading file!", Toast.LENGTH_LONG).show();
                    e.printStackTrace();
                } finally {
                    if (reader != null) {
                        try {
                            reader.close();
                        } catch (IOException e) {
                            //log the exception
                        }
                    }
                }


                tv1.setText((CharSequence) text);


            }
            if (dato.equals("Chaicas")) {
                toolbarLayout.setBackgroundResource(R.drawable.chaicas);
                toolbarLayout.setTitle(dato);

                BufferedReader reader = null;

                try {
                    reader = new BufferedReader(
                            new InputStreamReader(getAssets().open("chaicas")));

                    // do reading, usually loop until end of file reading
                    String mLine;
                    while ((mLine = reader.readLine()) != null) {
                        text.append(mLine);
                        text.append('\n');
                    }
                } catch (IOException e) {
                    Toast.makeText(getApplicationContext(), "Error reading file!", Toast.LENGTH_LONG).show();
                    e.printStackTrace();
                } finally {
                    if (reader != null) {
                        try {
                            reader.close();
                        } catch (IOException e) {
                            //log the exception
                        }
                    }
                }


                tv1.setText((CharSequence) text);


            }
            if (dato.equals("Caleta Gutierrez")) {
                toolbarLayout.setBackgroundResource(R.drawable.caletagutierrez);
                toolbarLayout.setTitle(dato);

                BufferedReader reader = null;

                try {
                    reader = new BufferedReader(
                            new InputStreamReader(getAssets().open("caletagutierrez")));

                    // do reading, usually loop until end of file reading
                    String mLine;
                    while ((mLine = reader.readLine()) != null) {
                        text.append(mLine);
                        text.append('\n');
                    }
                } catch (IOException e) {
                    Toast.makeText(getApplicationContext(), "Error reading file!", Toast.LENGTH_LONG).show();
                    e.printStackTrace();
                } finally {
                    if (reader != null) {
                        try {
                            reader.close();
                        } catch (IOException e) {
                            //log the exception
                        }
                    }
                }


                tv1.setText((CharSequence) text);



            }
            if (dato.equals("Caleta la Arena")) {
                toolbarLayout.setBackgroundResource(R.drawable.caletalaarena);
                toolbarLayout.setTitle(dato);

                BufferedReader reader = null;

                try {
                    reader = new BufferedReader(
                            new InputStreamReader(getAssets().open("caletalaarena")));

                    // do reading, usually loop until end of file reading
                    String mLine;
                    while ((mLine = reader.readLine()) != null) {
                        text.append(mLine);
                        text.append('\n');
                    }
                } catch (IOException e) {
                    Toast.makeText(getApplicationContext(), "Error reading file!", Toast.LENGTH_LONG).show();
                    e.printStackTrace();
                } finally {
                    if (reader != null) {
                        try {
                            reader.close();
                        } catch (IOException e) {
                            //log the exception
                        }
                    }
                }


                tv1.setText((CharSequence) text);


            }


        }
}
