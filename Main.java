package Lesson8;

public class Main {
    public static void main(String[] args) {
        SaveDocument txt = new SaveDocumentTxt();
        SaveDocument json = new SaveDocumentJson();
        SaveDocument xml = new SaveDocumentXml();

        txt.LineSaveDoс("file", "Иван Иванов=4.6");
        txt.LineSaveDoс("file", "Петр Петров=4.8");
        txt.LineSaveDoс("file", "Сидор Сидоров=4.6");

        json.LineSaveDoс("file", "{");
        json.LineSaveDoс("file", "\"Иван Иванов\": 4.6,");
        json.LineSaveDoс("file", "\"Петр Петров\": 4.8,");
        json.LineSaveDoс("file", "\"Сидор Сидоров\": 4.6");
        json.LineSaveDoс("file", "}");

        xml.LineSaveDoс("file", "<?xml version=\"1.0\" encoding=\"utf-8\" ?>");
        xml.LineSaveDoс("file", "<students>");
        xml.LineSaveDoс("file", "<student>");
        xml.LineSaveDoс("file", "<name>Иван Иванов</name>");
        xml.LineSaveDoс("file", "<grade>4.6</grade>");
        xml.LineSaveDoс("file", "</student>");
        xml.LineSaveDoс("file", "<student>");
        xml.LineSaveDoс("file", "<name>Петр Петров</name>");
        xml.LineSaveDoс("file", "<grade>4.8</grade>");
        xml.LineSaveDoс("file", "</student>");
        xml.LineSaveDoс("file", "<student>");
        xml.LineSaveDoс("file", "<name>Сидор Сидоров</name>");
        xml.LineSaveDoс("file", "<grade>4.6</grade>");
        xml.LineSaveDoс("file", "</student>");
        xml.LineSaveDoс("file", "</students>");

    }

}
