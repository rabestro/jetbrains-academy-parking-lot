// write the BankAccount class here
class BankAccount {
    val deposited: Long
    val withdrawn: Long
    val balance: Long

    constructor(deposit: Long, withdrawal: Long) {
        deposited = deposit
        withdrawn = withdrawal
        balance = deposit - withdrawal
    }
}