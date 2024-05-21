/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Asus
 */
public class NormalDoc implements DocumentBuilder {

    private String Extension;
    private String Encryption;

    @Override
    public DocumentBuilder SetExtension(String extension) {
        this.Extension = extension;
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public DocumentBuilder SetEncryption(String encryptionType) {
        this.Encryption = encryptionType;
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Document BuildDoc() {
        return new Document(Extension, Encryption);
    }
}
