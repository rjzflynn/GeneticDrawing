About
==============

GeneticDrawing is a programme which uses a genetic/hill-climbing algorithm to draw a continually evolving copy of a source image, using a set number of polygons containing 3 or more points. 

The process is as follows :

0) Setup a random DNA string  (application start).

1) Copy the current DNA sequence and mutate it slightly.

2) Use the new DNA to render polygons onto a canvas.

3) Compare the canvas to the source image.

4) If the new painting looks more like the source image than the previous painting did, then overwrite the current DNA with the new DNA.

5) repeat from 1.


==============



The main classes are:

1) GeneticAlgo.java, which contains the method which preforms the above steps.

2) DNAString.java, which encapsulates a "solution". i.e a number of 'genes'

3) Gene.java, a gene encapsulates a polygon in the following format: Red Green Blue Alpha Xcoordinates... Ycoordinates..

4) FitnessCalculator.java, the fitness calculator gives a fitness rating, based on how simillar an image is to the calculators source image.

Screenshot:


There is an option to export an SVG of the generated drawing.

This programme is an implementation of Roger Alsings original idea: http://rogeralsing.com/2008/12/07/genetic-programming-evolution-of-mona-lisa/



