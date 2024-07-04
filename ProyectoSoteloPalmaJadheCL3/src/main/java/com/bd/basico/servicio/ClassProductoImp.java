package com.bd.basico.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bd.basico.modelo.TblProductocl3;
import com.bd.basico.repositorio.IProductoRepositorio;

@Service
public class ClassProductoImp implements IProductoServicio{
@Autowired
private IProductoRepositorio iproductorepository;

@Override
public List<TblProductocl3> ListadoProductos() {
	
	return (List<TblProductocl3>) iproductorepository.findAll();
}

@Override
public void RegistrarProducto(TblProductocl3 producto) {
	iproductorepository.save(producto);
	
}

@Override
public TblProductocl3 BuscarporId(Integer id) {
	
	
	return iproductorepository.findById(id).orElse(null);
}

@Override
public void Eliminar(Integer id) {
	iproductorepository.deleteById(id);
	
}

}
