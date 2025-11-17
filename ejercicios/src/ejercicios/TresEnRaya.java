package ejercicios;
import java.util.Scanner;
public class TresEnRaya {

	public static void main(String[] args) {
		String gamer1="X";
		String gamer2="O";
		boolean turno=false;
		String [][] tablero=new String[3][3];
		String Currentgamer="";
		initialigTablero(tablero);
		imprimirTablero(tablero);
		//pedirPosicion();
		while(true) {
			if(turno)
				Currentgamer=gamer1;
			else {
				Currentgamer=gamer2;
			}
			int []posiciones=pedirPosicion();
			
			
			
			turno=CambiarTurno(turno);
			
		}
		
		

	}
	public static boolean CambiarTurno(boolean turno) {
		return !turno;
	}
	public static void imprimirTablero(String [][]t) {
		for(int i=0;i<t.length;i++) {
			for(int j=0;j<t[i].length;j++) {
				System.out.print(t[i][j] +" ");
			}
			System.out.println();
		}
	}
		public static void initialigTablero(String [][] t) {
			for(int i=0;i<t.length;i++) {
				for(int j=0;j<t[i].length;j++) {
					t[i][j]="_";
					}
				}
			
		}
		public static void ponerFicha(String [][]t,int []pos,String gamer1) {
			t[pos[0]][pos[1]]=gamer1;
		}
		public static boolean comprobarTablas(String [][]t) {
			for(int i=0;i<t.length;i++) {
				for(int j=0;j<t[i].length;j++) {
					if(t[i][j].equals("_"))
						return false;}
				}
			return true;
		}
	public static boolean posicionValida(String[][]t,int []pos) {
		return t[pos[0]][pos[1]].equals("_");
	}
	public static int [] pedirPosicion() {
		Scanner sc=new Scanner(System.in);
		int [] pos=new int[2];
		int x =0;
		int y=0;
		System.out.print("Introduce la posicion x");
		x=sc.nextInt();
		while(x<0 || x>2) {
			System.out.println("Posicion incorrecta");
			System.out.print("Introduce la posicion x");
			x=sc.nextInt();
		}
		pos[0]=x;
		System.out.println("Ingresa la posicion Y");
		y=sc.nextInt();
		
		while(y<0 || y>2) {
			System.out.println("Ingresame otro !Posicion no valida ");
			System.out.println("Ingresa la posicion Y");
			y=sc.nextInt();
		}
		pos[1]=y;
		sc.close();
		return pos;
		
	}
	public static boolean checkWinner(String [][]t,String gamer1) {
		boolean winner=false;
	for(int i=0;i<t.length;i++) {
		if(t[i][0].equals(gamer1) && t[i][1].equals(gamer1) && t[i][2].equals(gamer1))
			winner=true;
	}	
		for(int i=0;i<t.length;i++) {
			if(t[0][i].equals(gamer1) && t[1][i].equals(gamer1) && t[2][i].equals(gamer1)){
				winner=true;
			} 
		}
		if(t[0][0].equals(gamer1) && t[1][1].equals(gamer1) && t[2][2].equals(gamer1))
			winner=true;
		if(t[0][2].equals(gamer1) && t[1][2].equals(gamer1) && t[0][2].equals(gamer1))
			winner=true;
		
		return winner;
	}
	

}
