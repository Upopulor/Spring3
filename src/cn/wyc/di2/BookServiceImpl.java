package cn.wyc.di2;

public class BookServiceImpl implements BookService {
	//֮ǰ �ӿ�=ʵ����
	//private BookDao bookDao = new BookDaoImpl();
	//spring �ӿ�+set
	private BookDao bookDao;
	public void setBookDao(BookDao bookDao) {
		this.bookDao = bookDao;
	}
	@Override
	public void addBook() {
		this.bookDao.addBook();
	}
}
