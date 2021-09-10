public class Projetos {


    public static void main(String[] args) {
        String[] projetos = {"frontEnd", "backEnd", "bancoDeDados", "QAOuTester"};
        String troca = projetos[1];
        projetos[1]=projetos[3];
        projetos[3]=troca;

        for (int i=0;i< projetos.length;i++){
            System.out.println(projetos[i]);
        }
    }
}
