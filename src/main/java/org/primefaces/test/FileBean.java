package org.primefaces.test;

import org.primefaces.model.DefaultStreamedContent;
import org.primefaces.model.StreamedContent;

import jakarta.inject.Named;
import java.io.ByteArrayInputStream;

@Named("fileBean")
public class FileBean {

    public StreamedContent getFile() {
        return DefaultStreamedContent.builder()
                .name("download.txt")
                .contentType("text/plain")
                .stream(() -> new ByteArrayInputStream("Hello World".getBytes()))
                .build();
    }

}
