package co.ke.solpoint;

/**
 * Created by Oluoch on 10-07-2015.
 */
public enum Language {
    INST, SWAHILI, ENGLISH, DANISH, LUO;


    public void printSalaams(Language lang){
        switch(lang){

            case SWAHILI:
                System.out.println("Habari");
                break;
            case ENGLISH:
                System.out.println("Hallo");
                break;
            case DANISH:
                System.out.println("Hej");
                break;
            case LUO:
                System.out.println("Okuwe");
                break;
        }
    }
}
