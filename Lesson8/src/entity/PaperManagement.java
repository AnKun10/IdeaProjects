package entity;

import java.util.Arrays;

public class PaperManagement {
    Reporter reporter;
    PaperDetail[] paperDetails;

    public Reporter getReporter() {
        return reporter;
    }

    public void setReporter(Reporter reporter) {
        this.reporter = reporter;
    }

    public PaperDetail[] getPaperDetails() {
        return paperDetails;
    }

    public void setPaperDetails(PaperDetail[] paperDetails) {
        this.paperDetails = paperDetails;
    }

    @Override
    public String toString() {
        return "PaperManagement{" +
                "reporter=" + reporter +
                ", paperDetails=" + Arrays.toString(paperDetails) +
                '}';
    }
}
