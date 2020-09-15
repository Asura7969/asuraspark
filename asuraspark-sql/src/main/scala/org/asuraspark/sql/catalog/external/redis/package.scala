package org.asuraspark.sql.catalog

/**
 * redis schema to table(Mapping)
 * redis index: database (suffix = redis.[database])
 * redis key : tableName
 * redis value :
 *  hash:
 *    - field : column1(defaultName = column1)
 *    - value : column2(defaultName = column2)
 */
package object redis {

}
