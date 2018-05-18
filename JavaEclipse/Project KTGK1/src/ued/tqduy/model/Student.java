package ued.tqduy.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

public class Student {
//	private int id;
    private String name;
    private int tuoi;
    public static ArrayList<Student> list = new ArrayList<>();
    Scanner keyboard = new Scanner(System.in);

    public Student() {
    }

    public Student(/*int id,*/ String name, int tuoi) {
//        this.id = id;
        this.name = name;
        this.tuoi = tuoi;
    }

    public String getName() {
        return name;
    }

//    public int getID() {
//        return id;
//    }

    public int getTuoi() {
        return tuoi;
    }

    public void input() {
        int num;
        System.out.print("Nhap so luong sinh vien: ");
        num = Integer.parseInt(keyboard.nextLine());
        for (int i = 1; i <= num; i++) {
            System.out.println("Nhap thong tin cho sinh vien thu " + i);
//            System.out.print("  ID: ");
//            id = Integer.parseInt(keyboard.next());
//            keyboard.nextLine();
            System.out.print("  Ten: ");
            name = keyboard.nextLine();

            System.out.print("  Tuoi: ");
            tuoi = Integer.parseInt(keyboard.nextLine());
            Student st = new Student(name, tuoi);
            list.add(st);
        }
        System.out.println("\n--------------\n");
    }

    public void view() {
        System.out.println("Thong tin danh sach giao vien: ");
        Iterator<Student> itr = list.iterator();
        int i = 1;
        while (itr.hasNext()) {
            Student sts = itr.next();
            System.out.println("    " + i + ".   Ten=" + sts.getName() + ", Tuoi="
                    + sts.getTuoi());
            i++;
        }
        System.out.println("\n---------\n");
    }

    public void sort() {
        //Sap xep theo tuoi, neu tuoi trung nhau thi sap xep theo ten
//        list.sort((o1, o2) -> {
//            if (o1.getTuoi() == o2.getTuoi()) {
//                return o1.getName().compareToIgnoreCase(o2.getName());
//            } else {
//                return  (int)(o1.getTuoi() - o2.getTuoi());
//            }
//        }
//        );
        Collections.sort(list, new Comparator<Student>() {

            @Override
            public int compare(Student o1, Student o2) {
                // TODO Auto-generated method stub
                if (o1.getTuoi()==o2.getTuoi()) {

                    return o1.getName().compareToIgnoreCase(o2.getName());
                } else {
                    return (int)(o1.getTuoi()-o2.getTuoi());
                }
            }
        });

        System.out.println("\n--Danh sach sinh vien sau khi sap xep theo tuoi, ten--");
        list.forEach((d) -> {
            System.out.println("Ten=" + d.getName() + ", Tuoi=" + d.getTuoi());
        });
        System.out.println("\n--------\n");
    }
    
    public String getLastNameAndFirstName() {
    	return this.name.substring(name.lastIndexOf(" ") + 1)
    			+ this.name.substring(0, name.lastIndexOf(" ") - 1);
    }

    public static void sort2() {
        //Sap xep theo ten, neu ten trung nhau thi sap xep theo tuoi
        list.sort((o1, o2) -> {
            if (o1.getLastNameAndFirstName().equalsIgnoreCase(o2.getLastNameAndFirstName())) {
                return new Integer(o1.getTuoi()).compareTo(o2.getTuoi());
            } else {
                return o1.getLastNameAndFirstName().compareTo(o2.getLastNameAndFirstName());
            }
        }
        );
//        Collections.sort(list, new Comparator<Student>() {
//
//            @Override
//            public int compare(Student o1, Student o2) {
//                if (o1.getName().equalsIgnoreCase(o2.getName())) {
//
//                    return new Integer(o1.getTuoi()).compareTo(o2.getTuoi());
//                } else {
//                    return o1.getName().compareTo(o2.getName());
//                }
//            }
//        });
        System.out.println("\n--Danh sach sinh vien sau khi sap xep ten, tuoi--");
        list.forEach((d) -> {
            System.out.println("Ten=" + d.getName() + ", Tuoi=" + d.getTuoi());
        });
        System.out.println("\n--------\n");
    }

    public void search() {
        System.out.print("Nhap ten sinh vien can tim: ");
        keyboard.nextLine();
        String name1 = keyboard.nextLine();
        Iterator<Student> itr = list.iterator();
        System.out.println("\n--Thong tin tim kiem duoc--");
        while (itr.hasNext()) {
            Student sts = itr.next();
            if (sts.getName().equals(name1)) {
                System.out.println(" Ten=" + sts.getName() + ", Tuoi=" + sts.getTuoi());
            }
        }
        System.out.println("\n-----------\n");
    }
}
