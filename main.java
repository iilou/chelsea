import java.util.*;
class main {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    double[][] box = new double[3][4];
    double[][] sub = new double[3][4];
    double[][] bdsm = new double[3][4];

    for (int i = 0; i < 3; i++){
      for (int j = 0; j < 4; j++){
        box [i][j] = Double.parseDouble(sc.nextLine());
      }
    }

    double a = box [0][0];
    double b = box [1][0];
    double c = box [2][0];

    sub = box;
    
    for (int i = 0; i < 4; i++){
      bdsm [0][i] = box[0][i];
    }

    for (int i = 0; i < 4; i++){
      sub [0][i] = sub [0][i]*b;
      sub [1][i] = sub [1][i]*a;
      bdsm [1][i] = sub [1][i] - sub [0][i];
    }

    for (int i = 0; i < 4; i++){
      sub [0][i] = sub [0][i]*c/b;
      sub [2][i] = sub [2][i]*a;
      sub [2][i] = sub [2][i] - sub [0][i];
    }

    double b2 = bdsm[1][1];
    double c2 = bdsm[2][1];

    for (int i = 0; i < 4; i++){
      sub [2][i] = sub [2][i]*b2/a;
      sub [1][i] = sub [1][i]*c2/a;
      bdsm [2][i] = sub [2][i] - sub [1][i];
    }

    for (int i = 0; i < 3; i++){
      System.out.println(bdsm[i][0] + " " + bdsm[i][1] + " " + bdsm[i][2] + " " + bdsm[i][3]);
    }

  }

  // public static void square (double a, double b, double c, double d){
  //     System.out.println ("[" + a + " " + b + " " + c + " | " + d + "]");
  // }

}