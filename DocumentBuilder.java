/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Asus
 */
public interface DocumentBuilder {
    public DocumentBuilder SetExtension(String extension);
    public DocumentBuilder SetEncryption(String encryptionType);
    public Document BuildDoc();
}
