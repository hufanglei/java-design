package design.demo1;

/**
 * 导出数据到txt文件 concreteProduct
 */
public class ExportTxtFile implements ExportFileApi {
    @Override
    public boolean export(String data) {
        System.out.println("导出数据" + data + "到文本文件");
        return true;
    }
}
