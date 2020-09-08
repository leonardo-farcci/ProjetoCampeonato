package projetocamp;

import java.util.ArrayList;

public class Partida {

    private int golMandante;
    private int golVisitante;
    private String timeMandante;
    private String timeVisitante;

    public void cadastrarPartidas() {
        Time t = new Time();
        System.out.println(timeMandante + " VS " + timeVisitante);
        if (golMandante > golVisitante) {
            golMandante += 3;
            t.setPontos(golMandante);
        } else if (golMandante == golVisitante) {
            golMandante += 1;
            golVisitante += 1;
            t.setPontos(golMandante);
            t.setPontos(golVisitante);
        } else {
            golMandante += 0;
            golVisitante += 0;
            t.setPontos(golMandante);
            t.setPontos(golVisitante);
        }

    }

    /**
     * @return the golMandante
     */
    public int getGolMandante() {
        return golMandante;
    }

    /**
     * @param golMandante the golMandante to set
     */
    public void setGolMandante(int golMandante) {
        this.golMandante = golMandante;
    }

    /**
     * @return the golVisitante
     */
    public int getGolVisitante() {
        return golVisitante;
    }

    /**
     * @param golVisitante the golVisitante to set
     */
    public void setGolVisitante(int golVisitante) {
        this.golVisitante = golVisitante;
    }

    /**
     * @return the timeMandante
     */
    public String getTimeMandante() {
        return timeMandante;
    }

    /**
     * @param timeMandante the timeMandante to set
     */
    public void setTimeMandante(String timeMandante) {
        this.timeMandante = timeMandante;
    }

    /**
     * @return the timeVisitante
     */
    public String getTimeVisitante() {
        return timeVisitante;
    }

    /**
     * @param timeVisitante the timeVisitante to set
     */
    public void setTimeVisitante(String timeVisitante) {
        this.timeVisitante = timeVisitante;
    }

}
