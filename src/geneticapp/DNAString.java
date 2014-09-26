package geneticapp;

import static geneticapp.GeneticAlgo.randInt;
import java.util.ArrayList;
import java.util.List;

public class DNAString { /*A DNA String represents a solution, it encapsulates a number of genes/polygons
                          *The toString() returns the DNAstring in the following format:
                          *NUMBER_OF_VERTICES 
                          *NUMBER_OF_POLYGONS 
                          *R G B ALPHA X0 X1  ... Y0 Y1 ...
                          *R G B ALPHA X0 X1  ... Y0 Y1 ...
                          *... */ 

    private List<Gene> genes;
    private int numberOfPolygons;
    private int numberOfPointsInPolyon;

    public DNAString(int numberOfPolygons, int pointsInPolygon, int initialColor) {
        this.numberOfPolygons = numberOfPolygons;
        this.numberOfPointsInPolyon = pointsInPolygon;
        genes = new ArrayList<>();
        for (int i = 0; i < numberOfPolygons; i++) {
            genes.add(new Gene(pointsInPolygon, initialColor));
        }
    }
     

    public DNAString(String dna) {
        String[] values = dna.split("\\r?\\n");
        this.numberOfPolygons = Integer.valueOf(values[0]);
        this.numberOfPointsInPolyon = Integer.valueOf(values[1]);
        this.genes = new ArrayList<>();
        int helper = 0;
        for (int i = 2; i < values.length; i++) {
            this.genes.add(new Gene(values[i]));
            helper++;
        }
    }

    public List<Gene> getGenes() {
        return genes;
    }

    /*
     Mutators:
     */
    void mutateHard() {
        Gene selectedGene = genes.get(randInt(0, this.genes.size() - 1));
        selectedGene.hardMutate();
    }

    void mutateMedium() {
        Gene selectedGene = genes.get(randInt(0, this.genes.size() - 1));
        selectedGene.mediumMutate();
    }

    void mutateSoft() {
        Gene selectedGene = genes.get(randInt(0, this.genes.size() - 1));
        selectedGene.softMutate();
    }

    @Override
    public String toString() {
        String str = "" + this.numberOfPolygons + "\n"
                + this.numberOfPointsInPolyon;
        for (int i = 0; i < genes.size(); i++) {
            str += "\n" + genes.get(i).toString();
        }
        return str;
    }
}
