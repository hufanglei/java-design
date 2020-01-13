package design;

public class Client {
    public static void main(String[] args) {
        ExportOperate exportOperate = new ExportXmlFileOperate();
        exportOperate.export(1,"--测试数据--");
        exportOperate.export(2,"--测试数据--");
        exportOperate.export(3,"--测试数据--");
    }
}
