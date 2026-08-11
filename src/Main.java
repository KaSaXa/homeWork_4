public class Main {
    public static void main(String[] args) {
//task 1
        int age = 24;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", он достиг совершеннолетия.");
        } else {
            System.out.println("Если возраст человека равен " + age + ", он не достиг совершеннолетия, нужно ещё подождать.");
        }
//task 2
            int temp = 12;
            if (temp < 5) {
                System.out.println("На улице холодно, нужно надеть шапку");
            }  else {
                    System.out.println("Сегодня тепло, можно идти без шапки");
                }
//task 3
                int speed = 45;
                if (speed > 60) {
                    System.out.println("Если скорость " + speed + ", то придётся заплатить штраф");
                }    else {
                        System.out.println("Если скорость " + speed + ", то можно ездить спокойно");
                    }

//task 4
                int oldMen = 46;
                if (oldMen >= 2 && oldMen <= 6) {
                    System.out.println("Если возраст человека равен " + oldMen + ", то ему нужно ходить в детский сад");
                }   else if (oldMen >= 7 && oldMen <= 17) {
            System.out.println("Если возраст человека равен " + oldMen + ", то ему нужно ходить в школу");
        }       else if (oldMen >= 18 && oldMen <= 24) {
            System.out.println("Если возраст человека равен " + oldMen + ", то ему нужно ходить в университет");
        }         else {
            System.out.println("Если возраст человека равен " + oldMen + ", то ему пора ходить на работу");
        }





//task 5
                int ageBoy = 12;
                if (ageBoy < 5) {
                    System.out.println("Если возраст ребенка равен " + ageBoy + ", то ему нельзя кататься на аттракционе");
                } else if (ageBoy <= 14) {
                    System.out.println("Если возраст ребенка равен " + ageBoy + ", то ему можно кататься на аттракционе в сопровождении взрослого");
                } else {
                    System.out.println("Если возраст ребенка равен " + ageBoy + ", то ему можно кататься на аттракционе без сопровождения взрослого");
                }
//task 6
                int passengers = 72;

                if (passengers < 60) {
                    System.out.println("В вагоне есть сидячие места");
                } else if (passengers < 102) {
                    System.out.println("В вагоне есть стоячие места");
                } else {
                    System.out.println("Вагон полностью забит");
                }
//task 7
                byte one = 36;
                byte two = 54;
                byte three = 4;

                if (one >= two && one >= three) {
                    System.out.println("Наибольшее число: " + one);
                } else if (two >= one && two >= three) {
                    System.out.println("Наибольшее число: " + two);
                } else {
                    System.out.println("Наибольшее число: " + three);
                }

        }
    }



