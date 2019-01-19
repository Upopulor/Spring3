package cn.wyc.di2;

public class BookServiceImpl implements BookService {
	//之前 接口=实现类
	//private BookDao bookDao = new BookDaoImpl();
	//spring 接口+set
	private BookDao bookDao;
	public void setBookDao(BookDao bookDao) {
		this.bookDao = bookDao;
	}
	@Override
	public void addBook() {
		this.bookDao.addBook();
	}
}
