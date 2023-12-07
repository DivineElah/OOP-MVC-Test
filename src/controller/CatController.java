package controller;

import java.util.ArrayList;
import java.util.List;

import model.*;

public class CatController {
    private List<Cat> catDB;

    public CatController() {
        catDB = new ArrayList<>();
    }

    public void addCat(Cat newCat) {
        for (Cat cat: catDB) {
            if (newCat.getId() == cat.getId()) {
                System.out.println("ID mèo đã tồn tại!");
                return;
            }
        }
        catDB.add(newCat);
        System.out.println("Thêm mèo thành công!");
    }

    public void delCat(int id) {
        for (Cat cat: catDB) {
            if (cat.getId() == id) {
                catDB.remove(cat);
                System.out.println("Xoá bỏ mèo thành công!");
                return;
            }
        }
        System.out.println("ID mèo không tồn tại!");
    }

    public void showAll() {
        for (Cat cat: catDB) {
            cat.inThongTin();
            System.out.println();
        }
    }

    public void showCat(int id) {
        for (Cat cat: catDB) {
            if (cat.getId() == id) {
                cat.inThongTin();
                System.out.println();
                return;
            }
        }
        System.out.println("ID mèo không tồn tại!");
    }

    public void meow(int id) {
        for (Cat cat: catDB) {
            if (cat.getId() == id) {
                cat.Meow();
                return;
            }
        }
        System.out.println("ID mèo không tồn tại!");
    }
}
