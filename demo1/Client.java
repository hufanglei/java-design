package design.demo1;

public class Client {
    public static void main(String[] args) {
       // ExportOperate exportOperate = new ExportDBFileOperate();
        ExportOperate exportOperate = new ExportTxtFileOperate();
        exportOperate.export("--测试数据--");
    }
}
