package model;

import javassist.tools.web.Viewer;
import lombok.Data;

import java.util.Date;

@Data
public class Tomatoes {
    private Date lastUpdated;
    private String production;
    private String consensus;
    private int fresh;
    private  int rotten;
    private Critic critic;
    private Viewer viewer;
}
