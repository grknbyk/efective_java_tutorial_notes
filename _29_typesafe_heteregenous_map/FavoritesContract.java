package _29_typesafe_heteregenous_map;

// API 
public interface FavoritesContract {
	
	public <T> void putFavorite(Class<T> type, T instance);
    public <T> T getFavorite(Class<T> type);

}
