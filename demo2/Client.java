package design.demo2;

public class Client {
    public static void main(String[] args) {
       // ExportOperate exportOperate = new ExportDBFileOperate();
        ExportOperate exportOperate = new ExportOperate();
        exportOperate.export(2,"--测试数据--");
    }
}
