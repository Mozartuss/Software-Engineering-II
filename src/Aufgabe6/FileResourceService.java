package Aufgabe6;

class FileResourceService {

  private static FileResourceService instance;

  /**
   * this prevent rhe method call from another class.
   */

  private FileResourceService() {
  }

  /**
   * This is a access method and gives you once a concrete Object and returns it.
   * It can just called by one thread at the same time because of the 'synchronized'
   * You only need this if you have a multithreaded project
   *
   * @return instance
   */

  static synchronized FileResourceService getInstance() {
    if (instance == null) {
      instance = new FileResourceService();
    }
    return instance;
  }
}


