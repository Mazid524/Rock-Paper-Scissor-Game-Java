import java.util.Scanner;
/**
 * We are going to solve a problem which can give us a game we called Roch Paper & Scisser;
 * */
public class Rock_Paper_Scissors

{
    public static void main(String[] args)
    {
        // We goona get the scanner function
        Scanner in = new Scanner(System.in);

        // We are declaring veriables integer and string
        String select = "";
        int win = 0;
        int lost = 0;
        int tied = 0;
        //nubu h  xbgfyr  bvhv bhgyt nuttertnh mood ojj
        //nud nxc dhu hub month for the each profit
        //nutertools all istar
        // kool game for the variable on the other hand but not that one
        // not for ll varible for it
        // not for the all gracies
        // not int for the spasific value to tr
        //we gonna use a Do loop for executing the whole program
        //also we will make lots of if else logic for the users
        do{

            System.out.println("Let's play...");

            // We are creating a random number between 1 and 3
            int pick = (int)(Math.random()*3)+1;

            // Printing the user and computer input for now
            System.out.println("        Your turn (ROCK=1, PAPER=2, SCISSORS=3)? " + pick);
            System.out.print("I picked ");
            String myPick = in.next().toUpperCase().trim();

            //not for this method and on so on
            //we have kto fill this varible to each one
            //not for the full type of varible v h bgf
            //bv hfkv hvbsv hbyfs bvxbv butnhbvdhbvv vgc gbgvxv j
            //vbvgvgvhbv ybv  vvh vdh vvgcoidjfhwc bfyghbs bns gvsbcgcn uvfvhfbj hvfgscfw
            //this specific method for the each of variable whic we are working on it
            //this is not the varible for each
            // Now computer will make the dicision based on rock paper and scisser
            // by comparing 1,2 and 3
            //in.close();
            if(pick== 1 && myPick.equals("ROCK") )
            {
                System.out.print("we tied!");
                tied++;

            }
            else if(pick==1 && myPick.equals("PAPER"))
            {
                System.out.print(" I win!");
                win++;

            }
            else if(pick==1 && myPick.equals("SCISSORS"))
            {
                System.out.print(" you win!");
                lost++;

            }
            else if(pick==2 && myPick.equals("ROCK"))
            {
                System.out.print(" you win!");
                lost++;

            }
            else if(pick==2 && myPick.equals("PAPER"))
            {
                System.out.print(" we tied!");
                tied++;
            }
            else if(pick==2 && myPick.equals("SCISSORS"))
            {
                System.out.print(" I win!");
                win++;

            }
            else if(pick==3 && myPick.equals("ROCK"))
            {
                System.out.print(" I win!");
                win++;

            }
            else if(pick ==3 && myPick.equals("PAPER"))
            {
                System.out.print(" you win!");
                lost++;

            }
            else if(pick==3 && myPick.equals("SCISSORS"))
            {
                System.out.print(" we tied!");
                tied++;

            }
            // if user inputs are wrong then folloing outout will showed up
            else
            {
                System.out.print("INVALID INPUT.........ERORR........");
            }

            System.out.printf(" %n");
            System.out.printf(" %n");
            System.out.print("Play again (y/n)? ");
            select = in.next();
            System.out.printf(" %n");

        }while(!select.equals("n"));// if user hits n button the loop will stop

        // these output will shows some statistic based on the the whole program
        //nuttertools jnv jnvd jdnvd izsoi svjsvb bvh hskjvb sbvs jnvhsv hbvnvbkj vbsjnjs jvhshf
        //jkuv bvusjn bvubd hbvd vbshvb hbed vd j vnvdnjvnnvud jvdnv jdnvdh hbvb bvuhfa nufjbvhsb svsjsb
        System.out.println();
        System.out.printf("Here are the stats: %n");
        System.out.printf("        You won %d times %n", win);
        System.out.printf("        You lost %d times %n", lost);
        System.out.printf("        You tied %d times %n", tied);
        System.out.print("That was fun!!");
    }
    
}
 