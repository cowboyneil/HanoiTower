public class App {
    
    public static void main(String[] args) {
    //write a program to solve the tower of hanoi problem
    int disks = 3; //number of disks to be moved
    DiskMovement(disks,'A','C','B');
    }


        public static void DiskMovement(int disks, char from, char to, char helper){
        if (disks == 1){
            System.out.println("Move disk 1 from " + from + " to " + to);
            return;
        }
        else {
            DiskMovement(disks - 1, from, helper, to);
            System.out.println("Move disk " + disks + " from " + from + " to " + to);
            DiskMovement(disks - 1, helper, to, from);
        }
        }
    
    }
          

        

