package services;

import models.ExportProducts;
import models.ImportedProducts;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExportProductsService implements IService {
    Scanner scanner = new Scanner(System.in);
    static int id = 0;
    static List<ExportProducts> exportProductsList = new ArrayList<>();
    public static final String PRODUCTS_CSV1 = "D:\\CodeGym\\C1021G1-MacMaiTrungHieu\\ThiThucHanh\\src\\data\\products.csv";
    public static final String PRODUCTS_CSV = PRODUCTS_CSV1;

    public ExportProductsService() {
        readFile();
    }

    @Override
    public void add() {
        System.out.println("Tạo mới sản phẩm");
        System.out.println("Nhập ID sản phẩm");
        String idProduct = scanner.nextLine();
        System.out.println("Nhập tên sản phẩm");
        String name = scanner.nextLine();
        System.out.println("Nhập giá sản phẩm");
        int price = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập số lượng");
        int quantily = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên nhà sản xuất");
        String nameProducer = scanner.nextLine();
        System.out.println("Nhập giá nhập khẩu");
        int priceExport = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập quốc gia");
        String country = scanner.nextLine();
        id++;
        ExportProducts exportProducts = new ExportProducts(id, idProduct, name, price, quantily, nameProducer, priceExport, country);
        exportProductsList.add(exportProducts);
        writeFile();
    }

    @Override
    public void display() {
        for (ExportProducts exportProducts : exportProductsList) {
            System.out.println(exportProducts);
        }
    }

    @Override
    public void remove() {
        System.out.println("Nhập id muốn xóa");
        int id = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < exportProductsList.size(); i++) {
            if (exportProductsList.get(i).getId() == id) {
                do {
                    System.out.println("Bạn có muốn xóa sinh viên có ID " + id + " không?");
                    System.out.println("YES or NO");
                    String yes = scanner.nextLine();
                    if (yes.equals("YES")) {
                        exportProductsList.remove(i);
                        System.out.println("Xóa thành công");
                        break;
                    } else {
                        System.out.println("Xóa ko thành công vui lòng nhập đúng định dạng YES or NO");
                    }
                } while (true);
            }
        }

    }

    @Override
    public void find() {
        System.out.println("Nhập tên sản phẩm muốn tìm kiếm");
        String name = scanner.nextLine();
        for (int i = 0; i < exportProductsList.size(); i++) {
            if (exportProductsList.get(i).getName().contains(name)) {
                System.out.println(exportProductsList.get(i));
            }
        }
    }

    public static void writeFile() {

        try {
            FileWriter fileWriter = new FileWriter(PRODUCTS_CSV);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (ExportProducts products : exportProductsList) {
                bufferedWriter.write(products.getId() + "," + products.getIdProduct() + "," + products.getName() + ","
                        + products.getPrice() + "," + products.getQuantily() + "," + products.getNameProducer() + "," + products.getPriceExport() + "," + products.getCountry());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readFile()throws NumberFormatException{
        exportProductsList.clear();
        try {
            FileReader fileReader = new FileReader(PRODUCTS_CSV);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String data;
            while ((data = bufferedReader.readLine()) != null) {
                String[] newData = data.split(",");
                ImportedProducts importedProducts = new ImportedProducts(Integer.parseInt(newData[0]), newData[1],
                        (newData[2]), Integer.parseInt(newData[3]),
                        Integer.parseInt(newData[4]), (newData[5]), Integer.parseInt(newData[6])
                        , (newData[7]));
                exportProductsList.add((ExportProducts) exportProductsList);
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
