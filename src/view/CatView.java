package view;

import Helper.InputHelper;
import controller.CatController;

public class CatView {
    public CatController catController;

    public CatView() {
        catController = new CatController();
        menu();
    }

    public void menu() {
        System.out.println("1. Thêm mèo.");
        System.out.println("2. Xóa mèo theo ID.");
        System.out.println("3. Hiển thị toàn bộ mèo.");
        System.out.println("4. Hiển thị mèo theo ID.");
        System.out.println("5. Thay đổi tiếng mèo kêu theo ID.");
        System.out.println("6. Thoát");
        int opt = InputHelper.intHelper("Mời nhập lựa chọn.");
        request(opt);
    }

    public void request(int opt) {
        switch (opt) {
            case 1:
                catController.addCat(InputHelper.catHelper("Nhập loại mèo muốn thêm.\n" +
                        " (1. arab/2. long hair/3. short hair/4. russian)."));
                break;
            case 2:
                catController.delCat(InputHelper.intHelper("Nhập ID mèo muốn xóa."));
                break;
            case 3:
                catController.showAll();
                break;
            case 4:
                catController.showCat(InputHelper.intHelper("Nhập ID mèo muốn hiển thị."));
                break;
            case 5:
                catController.meow(InputHelper.intHelper("Nhập ID mèo muốn thay đổi tiếng kêu."));
                break;
            case 6:
                System.exit(0);
        }
        menu();
    }
}
