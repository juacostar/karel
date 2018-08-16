package unal.poo.practica;

import becker.robots.*;

/** 
 * Practica de los conceptos de Programacion Estructurada
 * @author Fabian Andres Giraldo */
public class RobotBase
{    
       //Declaracion de Variables -- Forma temporal - No es buena practica tener
       //variables estaticas
        public static City objetos;
        public static Robot estudiante;
        
	public static void main (String[] args){
            //Declarar la creacion de la ciudad
            objetos = new City("Field.txt");
	    objetos.showThingCounts(true);
            
            //Direction.NORTH, EAST, SOUTH, WEST
            //Definicion de la ubicacion del robot, Ciudad, posicion, Direccion, Numero things en el bolso.
            estudiante = new Robot(objetos,1, 0, Direction.EAST,10);
            int i=1;
            while(i<6){
                estudiante.move();
                i=i+1;
                
            }
	   estudiante.turnLeft();
           estudiante.turnLeft();
           estudiante.turnLeft();
           int j=1;
           while(j<6){
                estudiante.move();
                j=j+1;
            }
           estudiante.turnLeft();
           estudiante.turnLeft();
           estudiante.turnLeft();
            int k=1;
            while(k<5){
                estudiante.move();
                k=k+1;
            }
           estudiante.turnLeft();
           estudiante.turnLeft();
           estudiante.turnLeft();
           
           int l=1;
           while(l<5){
               estudiante.move();
               l=l+1;
           }
           estudiante.turnLeft();
           estudiante.turnLeft();
           estudiante.turnLeft();
           
           int m=1;
            while(m<4){
               estudiante.move();
               m=m+1;
           }
           estudiante.turnLeft();
           estudiante.turnLeft();
           estudiante.turnLeft();
           
           int n=1;
            while(n<4){
               estudiante.move();
               n=n+1;
           }
           estudiante.turnLeft();
           estudiante.turnLeft();
           estudiante.turnLeft();
           
           int o=1;
            while(o<3){
               estudiante.move();
               o=o+1;
           }
           estudiante.turnLeft();
           estudiante.turnLeft();
           estudiante.turnLeft();
           
           int p=1;
            while(p<3){
               estudiante.move();
               p=p+1;
           }
           estudiante.turnLeft();
           estudiante.turnLeft();
           estudiante.turnLeft();
           
           int q=1;
            while(q<2){
               estudiante.move();
               q=q+1;
           }
           estudiante.turnLeft();
           estudiante.turnLeft();
           estudiante.turnLeft();
           
           int r=1;
            while(r<2){
               estudiante.move();
               r=r+1;
           }
           
	}
        
       
}

