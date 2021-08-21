package br.com.spring.apirestdemo.service;

import br.com.spring.apirestdemo.exception.ResourceNotFoundException;
import br.com.spring.apirestdemo.models.ObjColor;
import br.com.spring.apirestdemo.repository.IObjColorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class ObjColorServiceImp implements ObjColorService{

    @Autowired
    private IObjColorRepository objColorRepository;

    @Override
    public ObjColor createObjColor(ObjColor objColor) {
        return objColorRepository.save(objColor);
    }

    @Override
    public ObjColor updateObjColor(ObjColor objColor) {
        Optional<ObjColor> objColorDb= this.objColorRepository.findById(objColor.getId());
        if (objColorDb.isPresent()){
            ObjColor objColorUpdate = objColorDb.get();
            objColorUpdate.setId((objColor.getId()));
            objColorUpdate.setWord(objColor.getWord());
            objColorRepository.save(objColorUpdate);
            return objColorUpdate;
        }else {
            throw new ResourceNotFoundException("Record not found with id: " + objColor.getId() );
        }

    }


    @Override
    public List<ObjColor> getAllObjColor() {
        return this.objColorRepository.findAll();
    }

    @Override
    public ObjColor getColorById(long objColorID) {
        Optional<ObjColor> objColorDb = this.objColorRepository.findById(objColorID);
        if (objColorDb.isPresent()) {
            return objColorDb.get();
        }else {
            throw new ResourceNotFoundException("Record not found with id: " + objColorID);
        }
    }

    @Override
    public void deleteObjColor(long objColorID) {
        Optional<ObjColor> objColorDb = this.objColorRepository.findById(objColorID);
        if (objColorDb.isPresent()){
            this.objColorRepository.delete(objColorDb.get());
        }else {
            throw new ResourceNotFoundException("Record not found with id: " + objColorID);
        }
    }
}
