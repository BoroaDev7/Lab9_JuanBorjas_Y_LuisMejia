
import javax.swing.JLabel;
import javax.swing.JOptionPane;


public class HiloCronometro implements Runnable {


    private boolean tiempo;
    private boolean vive;
    private JLabel segundos;

    public HiloCronometro(JLabel segundos) {
        this.segundos = segundos;
        tiempo = true;
        vive = true;
    }

    public void setAvanzar(boolean avanzar) {
        this.tiempo = avanzar;
    }

    public void setVive(boolean vive) {
        this.vive = vive;
    }

    public void run() {
        int total = 0;
        int total2 = 0;
        while (vive) {

            if (tiempo) {
                int i = 0;
                int t = 0;
                int j=0;
                while (i < 61) {
                    //segundos.setText(t + ":" + i + " minutos");
                    i += 1;
                    //segundos.setText(t + ":" + " minutos");
                    if (i == 60) {
                        t++;
                        total += t;

                        segundos.setText(total2 + ":" + total + " minutos");

                       // JOptionPane.showMessageDialog(null, "Han pasado " + total + " segundos");
                        if (total == 60) {
                            total=0;
                             j++;
                             total2+=j;
                                segundos.setText(j + ":" + total + " minutos");
                                JOptionPane.showMessageDialog(null,"Han pasado "+total2+" minutos");
                            
                        }

                    }

                }
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {

            }
        }
    }
}


