import java.sql.SQLOutput;
import java.util.Arrays;

public class Movies {

    public static void main(String[] args) {

        String[] movieTitles = {
                "Raiders of the Lost Ark(1981)",
                "Indiana Jones and the Temple of Doom(1984)",
                "Indiana Jones and the Last Crusade(1989)"
        };

        // System.out.println(Arrays.toString(movieTitles));

        String[][] movieActors = {{
                "Harrison Ford",
                "Karen Allen",
                "Paul Freeman"
        }, {
                "Harrison Ford",
                "Kate Capshaw",
                "Ke Huy Quan"
        }, {
                "Harrison Ford",
                "Denholm Elliott",
                "Alison Doody"
        }
        };

//        String[][] movies = new String[][]{
//                movieTitles,
//              movieActors,
//    };

        for (int i = 0; i < movieTitles.length; i++) {
            System.out.print("In the film " + movieTitles[i] + ", the main actors are: " );
            for (int j = 0; j < movieActors[i].length; j++) {
                System.out.print( movieActors[i][j]);
                if ( j < movieActors[i].length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println();
        }


    }
}
