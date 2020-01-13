package design;

/**
 *
 *   导出数据到数据库 concreteProduct
*/

public class ExportDbFile implements ExportFileApi {
    @Override
    public boolean export(String data) {
        System.out.println("导出数据" + data + "到数据库");
        return true;
    }
}
