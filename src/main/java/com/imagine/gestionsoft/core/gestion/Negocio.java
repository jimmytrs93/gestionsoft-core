package gestion;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the negocio database table.
 * 
 */
@Entity
@Table(name="negocio")
@NamedQuery(name="Negocio.findAll", query="SELECT n FROM Negocio n")
public class Negocio implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="negocio_id")
	private int negocioId;

	@Column(name="contacto_autorizado")
	private String contactoAutorizado;

	private String documento;

	private String email;

	private byte estado;

	@Temporal(TemporalType.DATE)
	@Column(name="fecha_creacion")
	private Date fechaCreacion;

	@Temporal(TemporalType.DATE)
	@Column(name="fecha_inactivacion")
	private Date fechaInactivacion;

	private String imagen;

	private String nombre;

	private String observacion;

	private String representante;

	private String telefono;

	//bi-directional many-to-one association to Cliente
	@OneToMany(mappedBy="negocio")
	private List<Cliente> clientes;

	//bi-directional many-to-one association to Colaborador
	@OneToMany(mappedBy="negocio")
	private List<Colaborador> colaboradors;

	//bi-directional many-to-one association to Factura
	@OneToMany(mappedBy="negocio")
	private List<Factura> facturas;

	//bi-directional many-to-one association to Item
	@OneToMany(mappedBy="negocio")
	private List<Item> items;

	//bi-directional many-to-one association to Reserva
	@OneToMany(mappedBy="negocio")
	private List<Reserva> reservas;

	//bi-directional many-to-one association to Usuario
	@OneToMany(mappedBy="negocio")
	private List<Usuario> usuarios;

	public Negocio() {
	}

	public int getNegocioId() {
		return this.negocioId;
	}

	public void setNegocioId(int negocioId) {
		this.negocioId = negocioId;
	}

	public String getContactoAutorizado() {
		return this.contactoAutorizado;
	}

	public void setContactoAutorizado(String contactoAutorizado) {
		this.contactoAutorizado = contactoAutorizado;
	}

	public String getDocumento() {
		return this.documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public byte getEstado() {
		return this.estado;
	}

	public void setEstado(byte estado) {
		this.estado = estado;
	}

	public Date getFechaCreacion() {
		return this.fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public Date getFechaInactivacion() {
		return this.fechaInactivacion;
	}

	public void setFechaInactivacion(Date fechaInactivacion) {
		this.fechaInactivacion = fechaInactivacion;
	}

	public String getImagen() {
		return this.imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getObservacion() {
		return this.observacion;
	}

	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}

	public String getRepresentante() {
		return this.representante;
	}

	public void setRepresentante(String representante) {
		this.representante = representante;
	}

	public String getTelefono() {
		return this.telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public List<Cliente> getClientes() {
		return this.clientes;
	}

	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}

	public Cliente addCliente(Cliente cliente) {
		getClientes().add(cliente);
		cliente.setNegocio(this);

		return cliente;
	}

	public Cliente removeCliente(Cliente cliente) {
		getClientes().remove(cliente);
		cliente.setNegocio(null);

		return cliente;
	}

	public List<Colaborador> getColaboradors() {
		return this.colaboradors;
	}

	public void setColaboradors(List<Colaborador> colaboradors) {
		this.colaboradors = colaboradors;
	}

	public Colaborador addColaborador(Colaborador colaborador) {
		getColaboradors().add(colaborador);
		colaborador.setNegocio(this);

		return colaborador;
	}

	public Colaborador removeColaborador(Colaborador colaborador) {
		getColaboradors().remove(colaborador);
		colaborador.setNegocio(null);

		return colaborador;
	}

	public List<Factura> getFacturas() {
		return this.facturas;
	}

	public void setFacturas(List<Factura> facturas) {
		this.facturas = facturas;
	}

	public Factura addFactura(Factura factura) {
		getFacturas().add(factura);
		factura.setNegocio(this);

		return factura;
	}

	public Factura removeFactura(Factura factura) {
		getFacturas().remove(factura);
		factura.setNegocio(null);

		return factura;
	}

	public List<Item> getItems() {
		return this.items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	public Item addItem(Item item) {
		getItems().add(item);
		item.setNegocio(this);

		return item;
	}

	public Item removeItem(Item item) {
		getItems().remove(item);
		item.setNegocio(null);

		return item;
	}

	public List<Reserva> getReservas() {
		return this.reservas;
	}

	public void setReservas(List<Reserva> reservas) {
		this.reservas = reservas;
	}

	public Reserva addReserva(Reserva reserva) {
		getReservas().add(reserva);
		reserva.setNegocio(this);

		return reserva;
	}

	public Reserva removeReserva(Reserva reserva) {
		getReservas().remove(reserva);
		reserva.setNegocio(null);

		return reserva;
	}

	public List<Usuario> getUsuarios() {
		return this.usuarios;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

	public Usuario addUsuario(Usuario usuario) {
		getUsuarios().add(usuario);
		usuario.setNegocio(this);

		return usuario;
	}

	public Usuario removeUsuario(Usuario usuario) {
		getUsuarios().remove(usuario);
		usuario.setNegocio(null);

		return usuario;
	}

}