package Presentacion.Comando;

import Presentacion.Comando.Comandos.Cliente.ActivarCliente;
import Presentacion.Comando.Comandos.Cliente.BorrarCliente;
import Presentacion.Comando.Comandos.Cliente.BuscarCliente;
import Presentacion.Comando.Comandos.Cliente.CrearCliente;
import Presentacion.Comando.Comandos.Cliente.ModificarCliente;
import Presentacion.Comando.Comandos.Cliente.Query.ClienteConXProducto;
import Presentacion.Comando.Comandos.Cliente.Query.ProductoPorFecha;
import Presentacion.Comando.Comandos.Producto.ActivarProducto;
import Presentacion.Comando.Comandos.Producto.BorrarProducto;
import Presentacion.Comando.Comandos.Producto.BuscarProducto;
import Presentacion.Comando.Comandos.Producto.CrearProducto;
import Presentacion.Comando.Comandos.Producto.ModificarProducto;
import Presentacion.Comando.Comandos.Ventas.BuscarVenta;
import Presentacion.Comando.Comandos.Ventas.CerrarVenta;
import Presentacion.Comando.Comandos.Ventas.DevolucionProducto;
import Presentacion.Comando.Comandos.Vistas.ErrorComando;
import Presentacion.Comando.Comandos.Vistas.IniciarVista;
import Presentacion.Comando.Comandos.Vistas.PanelAdministracionVista;
import Presentacion.Comando.Comandos.Vistas.PanelTiendaVista;
import Presentacion.Comando.Comandos.Vistas.Cliente.ActualizarClienteVista;
import Presentacion.Comando.Comandos.Vistas.Cliente.AnadirClienteVista;
import Presentacion.Comando.Comandos.Vistas.Cliente.ClienteVista;
import Presentacion.Comando.Comandos.Vistas.Cliente.EmpresaVista;
import Presentacion.Comando.Comandos.Vistas.Cliente.ParticularVista;
import Presentacion.Comando.Comandos.Vistas.Producto.ActualizarProductoVista;
import Presentacion.Comando.Comandos.Vistas.Producto.AnadirProductoVista;
import Presentacion.Comando.Comandos.Vistas.Producto.ProductoVista;
import Presentacion.Comando.Comandos.Vistas.Ventas.AnadirProductoCarrito;
import Presentacion.Comando.Comandos.Vistas.Ventas.BuscarProductoVenta;
import Presentacion.Comando.Comandos.Vistas.Ventas.ListaVentaVista;
import Presentacion.Comando.Comandos.Vistas.Ventas.QuitarProductoCarrito;
import Presentacion.Comando.Comandos.Vistas.Ventas.VolverVentaVista;


public class FactoriaComandoImp extends FactoriaComando {

	public Comando crearComando(String nombreComando) {
		
		switch(nombreComando) {
		
		
			//VISTAS
		
				//Frame Principal
			
				case "iniciarVista":
					
					return new IniciarVista();
					
				case "cambiarPanelTiendaVista":
					
	 				return new PanelTiendaVista();
	 				
				case "cambiarPanelAdministracionVista":
					
					return new PanelAdministracionVista();
					
					
				//Productos
					
				case "cambiarProductoVista":
					
					return new ProductoVista();
					
				case "cambiarAnadirProductoVista":
					
					return new AnadirProductoVista();
					
				case "cambiarActualizarProductoVista":
				
					return new ActualizarProductoVista();
					
					
				//Clientes	
				
				case "cambiarClienteVista":
					
					return new ClienteVista();
					
				case "cambiarParticularVista":
					
					return new ParticularVista();
					
				case "cambiarEmpresaVista":
					
					return new EmpresaVista();
							
				case "cambiarAnadirClienteVista":
					
					return new AnadirClienteVista();
					
				case "cambiarActualizarClienteVista":
					
					return new ActualizarClienteVista();
					
					
					
				//Ventas
					
				case "AnadirProductoCarrito":
					
					return new AnadirProductoCarrito();
					
				case "QuitarProductoCarrito":
					
					return new QuitarProductoCarrito();
					
				case "cambiarListaVentaVista":
					
					return new ListaVentaVista();
					
				case "BuscarProductoVenta":
					
					return new BuscarProductoVenta();
					
				case "volverVentaVista":
					
					return new VolverVentaVista();

					
					
		
			//PRODUCTO --------------------------------------------------------
		
			case "BorrarProducto":
				
				return new BorrarProducto();
				
			case "CrearProducto":
				
				return new CrearProducto();
				
			case "ModificarProducto":
		
				return new ModificarProducto();
				
			case "BuscarProducto":
				
				return new BuscarProducto();
				
			case "ActivarProducto":
				
				return new ActivarProducto();
				
				
			//CLIENTE --------------------------------------------------------

			case "CrearCliente":
				
				return new CrearCliente();
				
			case "BuscarCliente":
				
				return new BuscarCliente();
				
			case "BorrarCliente":
				
				return new BorrarCliente();
			
			case "ActivarCliente":
				
				return new ActivarCliente();
			
			case "ModificarCliente":
				
				return new ModificarCliente();
				
			//CONSULTA --------------------------------------------------------
				
			case "ProductoPorFecha":
				
				return new ProductoPorFecha();
				
			case "ClienteConXProducto":
				
				return new ClienteConXProducto();
				
			//VENTA --------------------------------------------------------

			case "CrearVenta":
				
				return new CerrarVenta();

				
			case "BuscarVenta":
				
				return new BuscarVenta();
				
				
			case "DevolucionProducto":
				
				return new DevolucionProducto();
				
			// --------------------------------------------------------
				
			default:

				return new ErrorComando();
				
		
		}//switch
		
	}//crearComando

}//FactoriaComandoImp

