package br.com.spring.apirestdemo.service;

import br.com.spring.apirestdemo.models.ObjColor;

import java.util.List;

public interface ObjColorService {
    ObjColor createObjColor(ObjColor objColor);
    ObjColor updateObjColor(ObjColor objColor);
    List<ObjColor> getAllObjColor();
    ObjColor getColorById(long objColorID);
    void deleteObjColor(long Id);
}
