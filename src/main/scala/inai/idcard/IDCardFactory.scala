package inai.idcard

import inai.framework.Factory
import inai.framework.Product

class IDCardFactory extends Factory[IDCard] {
  private var owners: List[String] = Nil
  protected def createProduct(owner: String): IDCard = {
    new IDCard(owner)
  }
  protected def registerProduct(idCard: IDCard) {
    // ownersにownerを追加出来るようにする。
    // idcardのgetOwnerをコールして、ownerを取り出すことが必要。
    // IDCardのインスタンスが必要
    owners = idCard.getOwner :: owners
  }
  def getOwners: List[String] = {
    owners
  }
}