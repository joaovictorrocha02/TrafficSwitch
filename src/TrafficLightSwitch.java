import java.util.Scanner;
public class TrafficLightSwitch {

    public static void main(String args[]) {
        String nextColor;
        System.out.print("Enter a color code\n");
        Scanner keyboard = new Scanner(System.in);
        int currentColor = keyboard.nextInt();
        
        
        switch (currentColor) {
            case 1:
                nextColor = "green"; //Cor 1 do semáforo é verde
                System.out.println("Next Traffic Light is green " );
                break;
            case 2:
                System.out.println("Next Traffic Light is yellow" );
                nextColor = "yellow"; //Cor 2 do semáforo é amarelo
                break;
            case 3:
                System.out.println("Next Traffic Light is red" );
                nextColor = "red"; //Cor 3 do semáforo é vermelho
                break;
            default :
                System.out.println("Traffic light inválido");
                //Número acima de 3 é inválido
                
                
                /*Programa que irá determinar a próxima cor do semáforo
                implementando com instrução switch
                */
                
        }
    }
    }


